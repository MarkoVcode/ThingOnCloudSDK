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
package com.thingoncloud.bean.srv.direct;

import java.io.Serializable;
import java.util.List;

public class BeanDirectSourceValues implements Serializable {

	private static final long serialVersionUID = 1017779525514473910L;

	private List<BeanDirectSourceValue> values;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public List<BeanDirectSourceValue> getValues() {
		return values;
	}

	public void setValues(List<BeanDirectSourceValue> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BeanDirectSourceValues:\n");
		sb.append(" values: \n");
		for(BeanDirectSourceValue dv : values) {
			sb.append("-> ").append(dv.toString());
		}
		sb.append("\n");
		return sb.toString();
	}
}
