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
import java.util.List;

import com.thingoncloud.bean.Page;
import com.thingoncloud.bean.Ref;

public class BeanValues implements Serializable {

	private static final long serialVersionUID = 3749357265212028397L;

	private Ref self;
	private Ref owner;
	private Ref parent;
	private Ref direct;
	private Ref endpoint;
	private String address;
	private List<BeanValue> values;
	private Page page;

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

	public Ref getDirect() {
		return direct;
	}

	public void setDirect(Ref direct) {
		this.direct = direct;
	}

	public Ref getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(Ref endpoint) {
		this.endpoint = endpoint;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<BeanValue> getValues() {
		return values;
	}

	public void setValues(List<BeanValue> values) {
		this.values = values;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanValues [self=").append(self).append(", owner=")
				.append(owner).append(", parent=").append(parent)
				.append(", direct=").append(direct).append(", endpoint=")
				.append(endpoint).append(", address=").append(address)
				.append(", values=").append(values).append(", page=")
				.append(page).append("]");
		return builder.toString();
	}

}
