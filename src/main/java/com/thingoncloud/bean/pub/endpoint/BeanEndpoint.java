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
package com.thingoncloud.bean.pub.endpoint;

import java.io.Serializable;

import com.thingoncloud.bean.Ref;

public class BeanEndpoint implements Serializable {

	private static final long serialVersionUID = 1141761321310958820L;

	private Ref self;
	private Ref owner;
	private Ref parent;
	private String id;
	private String address;
	private String created;
	private String updated;
	private String description;
	private String longDescription;
	private String icon;
	private String color;
	private Long sortOrder;
	private String geolocation;
	private String type;
	private BeanEndpointType configValues;

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

	public String getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(String geolocation) {
		this.geolocation = geolocation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BeanEndpointType getConfigValues() {
		return configValues;
	}

	public void setConfigValues(BeanEndpointType configValues) {
		this.configValues = configValues;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanEndpoint [self=").append(self).append(", owner=")
				.append(owner).append(", parent=").append(parent)
				.append(", id=").append(id).append(", address=")
				.append(address).append(", created=").append(created)
				.append(", updated=").append(updated).append(", description=")
				.append(description).append(", longDescription=")
				.append(longDescription).append(", icon=").append(icon)
				.append(", color=").append(color).append(", sortOrder=")
				.append(sortOrder).append(", geolocation=").append(geolocation)
				.append(", type=").append(type).append(", configValues=")
				.append(configValues).append("]");
		return builder.toString();
	}

}
