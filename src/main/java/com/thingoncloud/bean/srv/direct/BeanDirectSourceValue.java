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

import com.thingoncloud.bean.pub.endpoint.BeanEndpointType;

public class BeanDirectSourceValue implements Serializable {

	private static final long serialVersionUID = -258540900296498196L;

	private String address;
	private String date;
	private Long count;
	private String normalizedValue;
	private String description;
	private String longDescription;
	private String icon;
	private String color;
	private String geolocation;
	private String type;
	private String href;
	private BeanEndpointType properties;

	private Long slot;
	private Status status;
	private Result result;
	private String errorMessage;

	private String name;
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getNormalizedValue() {
		return normalizedValue;
	}

	public void setNormalizedValue(String normalizedValue) {
		this.normalizedValue = normalizedValue;
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

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public BeanEndpointType getProperties() {
		return properties;
	}

	public void setProperties(BeanEndpointType properties) {
		this.properties = properties;
	}

	public Long getSlot() {
		return slot;
	}

	public void setSlot(Long slot) {
		this.slot = slot;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BeanDirectSourceValues:\n");
		sb.append(" name: ").append(name).append("\n");
		sb.append(" value: ").append(value).append("\n");
		sb.append(" address: ").append(address).append("\n");
		sb.append(" date: ").append(date).append("\n");
		sb.append(" count: ").append(count).append("\n");
		sb.append(" normalizedValue: ").append(normalizedValue).append("\n");
		sb.append(" description: ").append(description).append("\n");
		sb.append(" longDescription: ").append(longDescription).append("\n");
		sb.append(" icon: ").append(icon).append("\n");
		sb.append(" color: ").append(color).append("\n");
		sb.append(" geolocation: ").append(geolocation).append("\n");
		sb.append(" type: ").append(type).append("\n");
		sb.append(" href: ").append(href).append("\n");
		sb.append(" slot: ").append(slot).append("\n");
		sb.append(" status: ").append(status).append("\n");
		sb.append(" result: ").append(result).append("\n");
		sb.append(" errorMessage: ").append(errorMessage).append("\n");
		sb.append(" properties: ").append(properties.toString()).append("\n");
		return sb.toString();
	}
}
