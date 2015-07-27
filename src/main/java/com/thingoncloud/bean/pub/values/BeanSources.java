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

import com.thingoncloud.bean.Ref;

public class BeanSources implements Serializable {

	private static final long serialVersionUID = -6369870911373678075L;

	private Ref self;
	private Ref owner;
	private Ref parent;
	private List<BeanSource> sources;

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

	public List<BeanSource> getSources() {
		return sources;
	}

	public void setSources(List<BeanSource> sources) {
		this.sources = sources;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanSources [self=").append(self).append(", owner=")
				.append(owner).append(", parent=").append(parent)
				.append(", sources=").append(sources).append("]");
		return builder.toString();
	}
}
