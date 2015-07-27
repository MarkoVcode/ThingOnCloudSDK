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

import com.thingoncloud.api.config.AbstractConfig;
import com.thingoncloud.api.interfaces.DirectServiceInterface;
import com.thingoncloud.bean.pub.direct.BeanDirect;


public abstract class Connection {

	/**
	 * Returns Direct service context of the direct provided as BeanDirect Object.
	 * Doesn't validate the BeanDirect Object. Doesn't make any calls.
	 * 
	 * @param directBean
	 * @return DirectContext
	 */
	public DirectServiceInterface getDirectAPIContext(BeanDirect directBean) {
		if(null != directBean)
			return getDirectAPIContext(directBean.getAddress());
		else
			return null;
	}
	
	/**
	 * Returns Direct service context of the direct provided as directID String.
	 * Doesn't validate the directID String. Doesn't make any calls.
	 * 
	 * @param directID
	 * @return DirectContext
	 */
	public abstract DirectServiceInterface getDirectAPIContext(String directID);
	
	protected String buildRequestUrl(String url, String path) {
		return url + path;
	}
	
	abstract Response doRequest(Verb method, String requestPath, String payload);
	
	abstract AbstractConfig getConfig();

}
