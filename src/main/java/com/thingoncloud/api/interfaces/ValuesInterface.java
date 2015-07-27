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
package com.thingoncloud.api.interfaces;

import com.thingoncloud.api.resp.pub.ServicesResponse;
import com.thingoncloud.api.resp.pub.SourcesResponse;
import com.thingoncloud.api.resp.pub.ValuesResponse;

public interface ValuesInterface {
	//here pagination object for query params
	public ServicesResponse fetchAllServiceIDs();
	public SourcesResponse fetchAllSourcesIDs(String serviceId);
	public ValuesResponse fetchSourceValues(String serviceId, String sourceId);
	public SourcesResponse deleteSourceWithAllValues(String serviceId, String sourceId);
	public ValuesResponse deleteSingleValue(String serviceId, String sourceId, Long slotId);	
}