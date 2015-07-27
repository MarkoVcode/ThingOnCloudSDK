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
package com.thingoncloud.api.resp.pub;

import org.scribe.model.Response;

import com.thingoncloud.bean.BeanError;

public abstract class AbstractResponse<ReturnBean> {

	protected BeanError errorBean;
	protected Response rawResponse;
	protected boolean error = false;

	public abstract ReturnBean getReturnBean();

	public abstract void setReturnBean(ReturnBean returnBean);

	public BeanError getErrorBean() {
		return errorBean;
	}

	public void setErrorBean(BeanError errorBean) {
		this.errorBean = errorBean;
		error = true;
	}

	public boolean hasError() {
		return error;
	}

	public Response getRawResponse() {
		return rawResponse;
	}

	public void setRawResponse(Response rawResponse) {
		this.rawResponse = rawResponse;
	}

}
