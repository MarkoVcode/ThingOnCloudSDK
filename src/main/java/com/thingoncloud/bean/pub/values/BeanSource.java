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
package com.thingoncloud.bean.pub.values;

import java.io.Serializable;

import com.thingoncloud.bean.Ref;

public class BeanSource implements Serializable {

	private static final long serialVersionUID = -799014392385542883L;

	private Ref self;
	private String name;
	private String value;
	private String date;
	private String createdDate;
	private Long slot;
	private Long noSamples;
	private String normalizedValue;
	private String normalizationStatus;

	public Ref getSelf() {
		return self;
	}

	public void setSelf(Ref self) {
		this.self = self;
	}

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Long getSlot() {
		return slot;
	}

	public void setSlot(Long slot) {
		this.slot = slot;
	}

	public Long getNoSamples() {
		return noSamples;
	}

	public void setNoSamples(Long noSamples) {
		this.noSamples = noSamples;
	}

	public String getNormalizedValue() {
		return normalizedValue;
	}

	public void setNormalizedValue(String normalizedValue) {
		this.normalizedValue = normalizedValue;
	}

	public String getNormalizationStatus() {
		return normalizationStatus;
	}

	public void setNormalizationStatus(String normalizationStatus) {
		this.normalizationStatus = normalizationStatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanSource [self=").append(self).append(", name=")
				.append(name).append(", value=").append(value)
				.append(", date=").append(date).append(", createdDate=")
				.append(createdDate).append(", slot=").append(slot)
				.append(", noSamples=").append(noSamples)
				.append(", normalizedValue=").append(normalizedValue)
				.append(", normalizationStatus=").append(normalizationStatus)
				.append("]");
		return builder.toString();
	}

}
