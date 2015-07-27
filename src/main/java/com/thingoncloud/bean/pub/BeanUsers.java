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
package com.thingoncloud.bean.pub;

import java.io.Serializable;
import java.util.List;

import com.thingoncloud.bean.Ref;

public class BeanUsers implements Serializable {

	private static final long serialVersionUID = -2091067172818622866L;

	private Ref self;
	private List<BeanUser> users;
	
	public Ref getSelf() {
		return self;
	}
	public void setSelf(Ref self) {
		this.self = self;
	}
	public List<BeanUser> getUsers() {
		return users;
	}
	public void setUsers(List<BeanUser> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BeanUsers:\n");
		sb.append(" self: ").append(self.toString()).append("\n");
		sb.append(" users: \n");
		for(BeanUser bu : users) {
			sb.append("-> ").append(bu.toString());
		}
		sb.append("\n");
		return sb.toString();
	}
}
