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

import org.scribe.model.Response;
import org.scribe.model.Verb;

import com.thingoncloud.api.interfaces.PrivateServiceInterface;
import com.thingoncloud.api.resp.adapter.ResponseAdapter;
import com.thingoncloud.api.resp.prv.WebUserCredentialsResponse;
import com.thingoncloud.api.resp.prv.WebUserResponse;
import com.thingoncloud.bean.prv.BeanWebUser;

public class PrivateContextNoAuth extends AbstractContext implements PrivateServiceInterface {
	
	private ConnectionNoAuth connection;
	
	PrivateContextNoAuth(ConnectionNoAuth connection) {
		this.connection = connection;
	}

	@Override
	public WebUserResponse activate(BeanWebUser webUser) {
		Response resp = connection.doRequest(Verb.POST, WebUserResponse.RESOURCE_ACTIVATE, serializeBean(webUser));
		return ResponseAdapter.toWebUserResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public WebUserResponse passwordUpdate(BeanWebUser webUser) {
		Response resp = connection.doRequest(Verb.POST, WebUserResponse.RESOURCE_PASSWD_UPDATE, serializeBean(webUser));
		return ResponseAdapter.toWebUserResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public WebUserResponse passwordReset(BeanWebUser webUser) {
		Response resp = connection.doRequest(Verb.POST, WebUserResponse.RESOURCE_PASSWD_RESET, serializeBean(webUser));
		return ResponseAdapter.toWebUserResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public WebUserResponse validateEmail(BeanWebUser webUser) {
		Response resp = connection.doRequest(Verb.POST, WebUserResponse.RESOURCE_VALIDATE_EMAIL, serializeBean(webUser));
		return ResponseAdapter.toWebUserResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public WebUserCredentialsResponse register(BeanWebUser webUser) {
		Response resp = connection.doRequest(Verb.POST, WebUserCredentialsResponse.RESOURCE_REGISTER, serializeBean(webUser));
		return ResponseAdapter.toWebUserCredentialsResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public WebUserCredentialsResponse authenticate(BeanWebUser webUser) {
		Response resp = connection.doRequest(Verb.POST, WebUserCredentialsResponse.RESOURCE_AUTHENTICATE, serializeBean(webUser));
		return ResponseAdapter.toWebUserCredentialsResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

}
