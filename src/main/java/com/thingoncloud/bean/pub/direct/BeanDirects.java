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
import java.util.List;

import com.thingoncloud.bean.Ref;

public class BeanDirects  implements Serializable {

	private static final long serialVersionUID = -2708147048116719869L;

	private Ref self;
	private Ref owner;
	private Ref parent;
	private List<BeanDirect> directs;
	
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
	public List<BeanDirect> getDirects() {
		return directs;
	}
	public void setDirects(List<BeanDirect> directs) {
		this.directs = directs;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BeanDirects:\n");
		sb.append(" self: ").append(self.toString()).append("\n");
		sb.append(" owner: ").append(owner.toString()).append("\n");
		sb.append(" parent: ").append(parent.toString()).append("\n");
		sb.append(" directs: \n");
		for(BeanDirect dir : directs) {
			sb.append("-> ").append(dir.toString());
		}
		sb.append("\n");
		return sb.toString();
	}
}
