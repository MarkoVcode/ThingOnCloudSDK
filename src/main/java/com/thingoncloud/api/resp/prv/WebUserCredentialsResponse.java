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
package com.thingoncloud.api.resp.prv;

import com.thingoncloud.api.resp.pub.AbstractResponse;
import com.thingoncloud.bean.prv.BeanWebUserCredentials;

public class WebUserCredentialsResponse extends AbstractResponse<BeanWebUserCredentials> {

	public static final String RESOURCE_AUTHENTICATE = "/private/user/authenticate";
	public static final String RESOURCE_REGISTER = "/private/user/register";
	
	private BeanWebUserCredentials webUserCredentialsBean;

	@Override
	public BeanWebUserCredentials getReturnBean() {
		// TODO Auto-generated method stub
		return webUserCredentialsBean;
	}

	@Override
	public void setReturnBean(BeanWebUserCredentials returnBean) {
		webUserCredentialsBean = returnBean;
	}

}
