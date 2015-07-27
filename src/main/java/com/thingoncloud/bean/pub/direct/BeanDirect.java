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
package com.thingoncloud.bean.pub.direct;

import java.io.Serializable;

import com.thingoncloud.bean.Ref;

public class BeanDirect implements Serializable {

	private static final long serialVersionUID = 5026528154130666013L;
	
	private Ref self;
	private Ref owner;
	private Ref parent;
	private String id;
	private String address;
	
	private String description;
	private String longDescription;
	private String icon;
	private String color;
	private Long sortOrder;
	
	private String timezone;
	private Boolean writeAuth;
	private Boolean readAuth;
	
	private Ref writeApplication;
	private Ref readApplication;
	
	private String created;
	private String updated;
	
	public Ref getSelf() {
		return self;
	}
	public void setSelf(Ref self) {
		this.self = self;
	}
	public Ref getOwner() {
		return owner;
	}
	public void setOwner(Ref owner) {
		this.owner = owner;
	}
	public Ref getParent() {
		return parent;
	}
	public void setParent(Ref parent) {
		this.parent = parent;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Long getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Boolean getWriteAuth() {
		return writeAuth;
	}
	public void setWriteAuth(Boolean writeAuth) {
		this.writeAuth = writeAuth;
	}
	public Boolean getReadAuth() {
		return readAuth;
	}
	public void setReadAuth(Boolean readAuth) {
		this.readAuth = readAuth;
	}
	public Ref getWriteApplication() {
		return writeApplication;
	}
	public void setWriteApplication(Ref writeApplication) {
		this.writeApplication = writeApplication;
	}
	public Ref getReadApplication() {
		return readApplication;
	}
	public void setReadApplication(Ref readApplication) {
		this.readApplication = readApplication;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
}
