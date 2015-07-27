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

import com.thingoncloud.api.interfaces.PrivateServiceInterface;
import com.thingoncloud.api.resp.prv.WebUserCredentialsResponse;
import com.thingoncloud.api.resp.prv.WebUserResponse;
import com.thingoncloud.bean.prv.BeanWebUser;


public class PrivateContext extends AbstractContext implements PrivateServiceInterface {

	private ConnectionOAuth connection;

	PrivateContext(ConnectionOAuth connection) {
		this.connection = connection;
	}

	@Override
	public WebUserResponse activate(BeanWebUser webUser) {
		connection.getClass();
		return null;
	}

	@Override
	public WebUserResponse passwordUpdate(BeanWebUser webUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebUserResponse passwordReset(BeanWebUser webUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebUserResponse validateEmail(BeanWebUser webUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebUserCredentialsResponse register(BeanWebUser webUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebUserCredentialsResponse authenticate(BeanWebUser webUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
