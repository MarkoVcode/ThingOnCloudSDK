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

import com.thingoncloud.bean.Ref;

public class BeanUser implements Serializable {

	private static final long serialVersionUID = 2299848078829895604L;

	private Ref self;
	private Ref owner;
	private Ref parent;
	private String id;
	private String email;
	private String password;
	private String username;
	private String usersurname;
	private String timezone;
	private String group;
	private Boolean primary;
	private Ref refApplications;
	private Ref refDirects;
	private Ref refEndpoints;
	private Ref refValues;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsersurname() {
		return usersurname;
	}
	public void setUsersurname(String usersurname) {
		this.usersurname = usersurname;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public Ref getRefApplications() {
		return refApplications;
	}
	public void setRefApplications(Ref refapplications) {
		this.refApplications = refapplications;
	}
	public Ref getRefDirects() {
		return refDirects;
	}
	public void setRefDirects(Ref refdirects) {
		this.refDirects = refdirects;
	}
	public Ref getRefEndpoints() {
		return refEndpoints;
	}
	public void setRefEndpoints(Ref refendpoints) {
		this.refEndpoints = refendpoints;
	}
	public Ref getRefValues() {
		return refValues;
	}
	public void setRefValues(Ref refvalues) {
		this.refValues = refvalues;
	}
	public Boolean getPrimary() {
		return primary;
	}
	public void setPrimary(Boolean primary) {
		this.primary = primary;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BeanUser:\n");
		sb.append(" self: ").append(self.toString()).append("\n");
		sb.append(" owner: ").append(owner.toString()).append("\n");
		sb.append(" parent: ").append(parent.toString()).append("\n");
		sb.append(" id: ").append(id).append("\n");
		sb.append(" email: ").append(email).append("\n");
		sb.append(" password: ").append(password).append("\n");
		sb.append(" username: ").append(username).append("\n");
		sb.append(" usersurname: ").append(usersurname).append("\n");
		sb.append(" timezone: ").append(timezone).append("\n");
		sb.append(" group: ").append(group).append("\n");
		sb.append(" primary: ").append(primary).append("\n");
		sb.append(" refApplications: ").append(refApplications.toString()).append("\n");
		sb.append(" refDirects: ").append(refDirects.toString()).append("\n");
		sb.append(" refEndpoints: ").append(refEndpoints.toString()).append("\n");
		sb.append(" refValues: ").append(refValues.toString()).append("\n");
		sb.append("\n");
		return sb.toString();
	}
}
