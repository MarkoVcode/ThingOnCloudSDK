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

import com.thingoncloud.api.interfaces.SystemInterface;
import com.thingoncloud.api.resp.adapter.ResponseAdapter;
import com.thingoncloud.api.resp.pub.EnvironmentResponse;

public class SystemContext extends AbstractContext implements SystemInterface {

	private ConnectionNoAuth connection;
	
	SystemContext(ConnectionNoAuth connection) {
		this.connection = connection;
	}
	
	private EnvironmentResponse envResp;

	@Override
	public EnvironmentResponse fetchEnvironmentInfo() {
		Response resp = connection.doRequest(Verb.GET, EnvironmentResponse.RESOURCE + "/environment", null);
		envResp = ResponseAdapter.toEnvironmentResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
		return envResp;
	}

}
