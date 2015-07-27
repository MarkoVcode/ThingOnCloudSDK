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

import org.scribe.model.Request;
import org.scribe.model.Response;
import org.scribe.model.Verb;

import com.thingoncloud.api.config.NoAuthConfig;
import com.thingoncloud.api.interfaces.DirectServiceInterface;
import com.thingoncloud.api.interfaces.PrivateServiceInterface;
import com.thingoncloud.api.interfaces.SystemInterface;

public class ConnectionNoAuth extends Connection {

	private NoAuthConfig config;
	
	ConnectionNoAuth(NoAuthConfig config) {
		this.config = config;
	}

	@Override
	Response doRequest(Verb method, String requestPath, String payload) {
		Request request = new Request(method, buildRequestUrl(config.getUrl(), requestPath));
		request.addHeader("Accept", "application/json");
		if(!method.equals(Verb.GET)) {
			request.addHeader("Content-Type", "application/json");
		}
		if(null != payload) {
			request.addPayload(payload);
		}
		Response response = request.send();
		return response;
	}
	
	@Override
	public DirectServiceInterface getDirectAPIContext(String directID) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets System Environment API Context.
	 * Doesn't make any calls by itself. 
	 */
	public SystemInterface getSystemAPIContext() {
		return new SystemContext(this);

	}
	
	/**
	 * Gets Private API Context.
	 * Doesn't make any calls by itself. 
	 */
	public PrivateServiceInterface getPrivateAPIContext() {
		return new PrivateContextNoAuth(this);

	}
	
	@Override
	NoAuthConfig getConfig() {
		return config;
	}


}
