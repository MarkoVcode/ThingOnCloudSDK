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
package com.thingoncloud.bean.pub.application;

import java.io.Serializable;

import com.thingoncloud.bean.Ref;

public class BeanApplication implements Serializable {

	private static final long serialVersionUID = 6575657583857434713L;

/*    
 * http://stackoverflow.com/questions/28781737/restlet-complex-object-to-xml-serializaton
 * here!
 * https://templth.wordpress.com/2015/02/23/optimizing-restlet-server-applications/
 * @Test
    public void masterProductWithLinkOnly() throws JsonGenerationException, JsonMappingException, IOException {      
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        mapper.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
        SimpleModule module = new SimpleModule("", Version.unknownVersion());
        module.addSerializer(DateTime.class, new DateTimeSerializer("yyyyMMdd'T'HHmmss.SSSZ"));
        module.addSerializer(Resource.class, new ResourceSerializer(mapper.getSerializationConfig()));
        mapper.registerModule(module);
        mapper.writeValue(writer, products);
        System.out.println(writer.toString());
        
        assertTrue(writer.toString().contains("@id\":\"/catalogue/products/290504088118021\""));
        assertTrue(writer.toString().contains("@id\":\"/catalogue/products/2905040001\""));
    }*/
	private Ref self;
	private Ref owner;
	private Ref parent;
	private String id;
	private String name;
	private String authType;
	private String resources;
	private Boolean internal;
	private String userKey;
	private String userSecret;
	private Long used;  //how many times used
	private String created;
	private String lastUsed;
	private String updated;
	
	public BeanApplication() {}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public Boolean isInternal() {
		return internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String getUserSecret() {
		return userSecret;
	}

	public void setUserSecret(String userSecret) {
		this.userSecret = userSecret;
	}

	public Long getUsed() {
		return used;
	}

	public void setUsed(Long used) {
		this.used = used;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

}
