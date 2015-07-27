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

import com.thingoncloud.api.exception.TOCInvalidValueException;
import com.thingoncloud.api.interfaces.DirectServiceInterface;
import com.thingoncloud.api.resp.adapter.ResponseAdapter;
import com.thingoncloud.api.resp.pub.UserResponse;
import com.thingoncloud.api.resp.srv.DirectServiceValueResponse;
import com.thingoncloud.api.resp.srv.DirectServiceValuesResponse;
import com.thingoncloud.bean.srv.direct.BeanDirectSourceValues;

public class DirectContext extends AbstractContext implements DirectServiceInterface {
	
	private Connection connection;
	private String contextDirectID;
	
	public DirectContext(Connection connection, String contextDirectID) {
		this.contextDirectID = contextDirectID;
		this.connection = connection;
	}

	@Override
	public DirectServiceValuesResponse pushToCollection(BeanDirectSourceValues values) {
		Response resp = connection.doRequest(Verb.POST, UserResponse.RESOURCE + contextDirectID, serializeBean(values));
		return ResponseAdapter.toDirectServiceValuesResponse(resp, ResponseAdapter.POST_CREATE_EXPECTED_CODE);
	}

	@Override
	public DirectServiceValuesResponse pushToCollection(String name, String value) {
		String uri = null;
		if(null != name && null != value && name.length() > 0 && value.length() > 0)
			uri = "/"+name+"/"+value;
		if(null != uri) {
			Response resp = connection.doRequest(Verb.POST, UserResponse.RESOURCE + contextDirectID + uri, null);
			return ResponseAdapter.toDirectServiceValuesResponse(resp, ResponseAdapter.POST_CREATE_EXPECTED_CODE);
		} else {
			throw new TOCInvalidValueException("Name of the source and value can't be null or empty.");
		}
	}

	@Override
	public DirectServiceValuesResponse pullSourcesValue() {
		Response resp = connection.doRequest(Verb.GET, UserResponse.RESOURCE + contextDirectID, null);
		return ResponseAdapter.toDirectServiceValuesResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public DirectServiceValueResponse pullSourceValue(String sourceName) {
		Response resp = connection.doRequest(Verb.GET, UserResponse.RESOURCE + contextDirectID + "/" + sourceName, null);
		return ResponseAdapter.toDirectServiceValueResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

}
