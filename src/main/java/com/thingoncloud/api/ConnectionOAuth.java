/**
 *  Copyright 2015 MarkoV
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 					ThingOnCloud.com SDK
 * 
 * Project home: https://github.com/MarkoVcode/ThingOnCloudSDK
 * 
 * @build <BUILDTAG> 
 * @date <BUILDDATE>
 * @version <RELEASEVERSION>
 */
package com.thingoncloud.api;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import com.thingoncloud.api.config.OAuthConfig;
import com.thingoncloud.api.interfaces.DirectServiceInterface;
import com.thingoncloud.api.interfaces.PrivateServiceInterface;
import com.thingoncloud.bean.pub.BeanUser;

public class ConnectionOAuth extends Connection {

	private OAuthService service;
	private Token accessToken = new Token("", "");
	private OAuthConfig config;
	
	ConnectionOAuth(OAuthConfig config) {
		this.config = config; 
		service = new ServiceBuilder()
				.provider(APIProviderStub.class)
				.apiKey(config.getUserKey())
				.apiSecret(config.getUserSecret())
				.build();
	}

	@Override
	Response doRequest(Verb method, String requestPath, String payload) {
		OAuthRequest request = new OAuthRequest(method, buildRequestUrl(config.getUrl(), requestPath));
		service.signRequest(accessToken, request);
		request.addHeader("Accept", "application/json");
		if (!method.equals(Verb.GET)) {
			request.addHeader("Content-Type", "application/json");
		}
		if (null != payload) {
			request.addPayload(payload);
		}
		Response response = request.send();
		return response;
	}
	
	/**
	 * Gets Public API Context of the primary user.
	 * The method is making immediate call to the service in order to receive the user ID and create 
	 * context.
	 */
	public PublicContext getPublicAPIDefaultUserContext() {
		return getPublicAPIUserContext(new String());
	}

	/**
	 * Gets Public API Context of user provided in BeanUser object.
	 * Doesn't make any calls by itself. 
	 * The validity of the BeanUser is not checked until further calls are being made.
	 */
	public PublicContext getPublicAPIUserContext(BeanUser userBean) {
		if(null != userBean)
			return getPublicAPIUserContext(userBean.getId());
		else 
			return null;
	}
	
	/**
	 * Gets Public API Context of user provided in userUUID String.
	 * Doesn't make any calls by itself. 
	 * The validity of the userUUID String is not checked until further calls are being made.
	 */
	public PublicContext getPublicAPIUserContext(String userUUID) {
		return new PublicContext(this, userUUID);
	}

	/**
	 * Gets Private API Context.
	 * Doesn't make any calls by itself. 
	 */
	public PrivateServiceInterface getPrivateAPIContext() {
		return new PrivateContext(this);

	}

	OAuthConfig getConfig() {
		return config;
	}

	void setConfig(OAuthConfig config) {
		this.config = config;
	}

	@Override
	public DirectServiceInterface getDirectAPIContext(String directID) {
		return new DirectContext(this, directID);
	}

}
