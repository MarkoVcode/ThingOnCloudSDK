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

import com.thingoncloud.api.config.BasicConfig;
import com.thingoncloud.api.config.NoAuthConfig;
import com.thingoncloud.api.config.OAuthConfig;

public class ThingOnCloudAPI {
	
	/**
	 * Gets OAUTH authenticated connection to communicate with the service
	 * Requires OAuthConfig configuration object.
	 * 
	 * @param OAuthConfig
	 * @return ConnectionOAuth
	 */
	public ConnectionOAuth getOAuthConnection(OAuthConfig config) {
		return new ConnectionOAuth(config);	
	}

	/**
	 * Gets connection without any authentication.
	 * Requires NoAuthConfig object as a configuration parameter
	 * 
	 * @param NoAuthConfig
	 * @return ConnectionNoAuth
	 */
	public ConnectionNoAuth getNoAuthConnection(NoAuthConfig config) {
		return new ConnectionNoAuth(config);		
	}
	
	/**
	 * Gets connection with HTTP Basic authentication
	 * Needs BasicConfig object as a parameter
	 * 
	 * @param BasicConfig
	 * @return ConnectionBasic
	 */
	public ConnectionBasic getBasicConnection(BasicConfig config) {
		return new ConnectionBasic(config);	
	}
}
