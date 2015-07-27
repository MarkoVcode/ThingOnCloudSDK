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
package com.thingoncloud.bean;

import java.io.Serializable;

public class BeanError implements Serializable {

	private static final long serialVersionUID = 889157384670919661L;
	
	private Integer status;
	private Integer code;
	private String property;
	private String message;
	private String devMessage;
	private String moreInfo;
	private String uri;
	private String contactEmail;
	private String homeRef;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDevMessage() {
		return devMessage;
	}
	public void setDevMessage(String devMessage) {
		this.devMessage = devMessage;
	}
	public String getMoreInfo() {
		return moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getHomeRef() {
		return homeRef;
	}
	public void setHomeRef(String homeRef) {
		this.homeRef = homeRef;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BeanError:\n");
		sb.append(" status: ").append(status).append("\n");
		sb.append(" code: ").append(code).append("\n");
		sb.append(" property: ").append(property).append("\n");
		sb.append(" message: ").append(message).append("\n");
		sb.append(" devMessage: ").append(devMessage).append("\n");
		sb.append(" moreInfo: ").append(moreInfo).append("\n");
		sb.append(" uri: ").append(uri).append("\n");
		sb.append(" contactEmail: ").append(contactEmail).append("\n");
		sb.append(" homeRef: ").append(homeRef).append("\n");
		return sb.toString();
	}
}
