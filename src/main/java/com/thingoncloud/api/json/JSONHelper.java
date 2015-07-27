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
package com.thingoncloud.api.json;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONHelper {

	private static JSONHelper instance;
	private ObjectMapper mapper;
    private StringWriter writer;
	
    private JSONHelper() {
		mapper = new ObjectMapper();
        writer = new StringWriter();
        mapper.setSerializationInclusion(Include.NON_NULL);
	}
	
	public static synchronized JSONHelper getInstance() {
		if(null == instance)
			instance = new JSONHelper();
		return instance;
	}
	
	public String serialize(Serializable bean) {
        try {
			mapper.writeValue(writer, bean);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer.toString();	
	}
	
	public Serializable deSerialize(String json, Class<? extends Serializable> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		Serializable returnObject = null;
		if(null != json) {
			try {
				returnObject = mapper.readValue(json, clazz);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return returnObject;
	}
}
