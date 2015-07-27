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

import org.apache.commons.codec.binary.Base64;
import org.scribe.model.Request;
import org.scribe.model.Response;
import org.scribe.model.Verb;

import com.thingoncloud.api.config.AbstractConfig;
import com.thingoncloud.api.config.BasicConfig;

public class ConnectionBasic extends Connection {

	private BasicConfig config;
	
	public ConnectionBasic(BasicConfig config) {
		this.config = config;
	}

	@Override
	public DirectContext getDirectAPIContext(String directID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	AbstractConfig getConfig() {
		return config;
	}

	@Override
	Response doRequest(Verb method, String requestPath, String payload) {
		String authString = config.getUserName() + ":" + config.getPassword();
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
		Request request = new Request(method, buildRequestUrl(config.getUrl(), requestPath));
		request.addHeader("Accept", "application/json");
		request.addHeader("Authorization", "Basic " + authStringEnc);
		if(!method.equals(Verb.GET)) {
			request.addHeader("Content-Type", "application/json");
		}
		if(null != payload) {
			request.addPayload(payload);
		}
		Response response = request.send();
		return response;
	}

}
