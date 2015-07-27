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
package com.thingoncloud.api;

import org.scribe.model.Response;
import org.scribe.model.Verb;

import com.thingoncloud.api.exception.TOCServiceContextException;
import com.thingoncloud.api.interfaces.ApplicationInterface;
import com.thingoncloud.api.interfaces.DirectInterface;
import com.thingoncloud.api.interfaces.EndpointInterface;
import com.thingoncloud.api.interfaces.UserInterface;
import com.thingoncloud.api.interfaces.ValuesInterface;
import com.thingoncloud.api.resp.adapter.ResponseAdapter;
import com.thingoncloud.api.resp.pub.ApplicationResponse;
import com.thingoncloud.api.resp.pub.ApplicationsResponse;
import com.thingoncloud.api.resp.pub.DirectResponse;
import com.thingoncloud.api.resp.pub.DirectsResponse;
import com.thingoncloud.api.resp.pub.EndpointResponse;
import com.thingoncloud.api.resp.pub.EndpointsResponse;
import com.thingoncloud.api.resp.pub.ServicesResponse;
import com.thingoncloud.api.resp.pub.SourcesResponse;
import com.thingoncloud.api.resp.pub.UserResponse;
import com.thingoncloud.api.resp.pub.UsersResponse;
import com.thingoncloud.api.resp.pub.ValuesResponse;
import com.thingoncloud.bean.pub.BeanUser;
import com.thingoncloud.bean.pub.application.BeanApplication;
import com.thingoncloud.bean.pub.direct.BeanDirect;
import com.thingoncloud.bean.pub.endpoint.BeanEndpoint;


public class PublicContext extends AbstractContext implements DirectInterface, UserInterface, ApplicationInterface, EndpointInterface, ValuesInterface {
	
	private String contextUserUUID;
	private ConnectionOAuth connection;
	private UsersResponse usersResp;
	private String contextUrl;
	
	PublicContext(ConnectionOAuth connection, String contextUserUUID) {
		this.connection = connection;
		if(null == contextUserUUID || contextUserUUID.isEmpty()) {
			UsersResponse ur = fetchAllUsers();
			BeanUser bu = ur.getDefaultUser();
			if(null != bu) {
				this.contextUserUUID = bu.getId();
			} else {
				throw new TOCServiceContextException("The context can not be determined. The user key or secret might be incorrect!"); 
			}
		} else {
			this.contextUserUUID = contextUserUUID;			
		}
	}
	
	private String generateContextUrl() {
		if(null == contextUrl) {
			StringBuilder sb = new StringBuilder();
			sb.append(UserResponse.RESOURCE);
			sb.append(contextUserUUID);
			contextUrl = sb.toString();
			return contextUrl;
		} else 
			return contextUrl;
	}

	@Override
	public UsersResponse fetchAllUsers() {
		Response resp = connection.doRequest(Verb.GET, UsersResponse.RESOURCE, null);
		usersResp = ResponseAdapter.toUsersResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
		return usersResp;
	}
	
	@Override
	public UsersResponse getAllUsers() {
		return usersResp;
	}
	
	@Override
	public UserResponse fetchUser(String userUUID) {
		Response resp = connection.doRequest(Verb.GET, UserResponse.RESOURCE + userUUID, null);
		return ResponseAdapter.toUserResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public UserResponse updateUser(BeanUser userBean) {
		Response resp = connection.doRequest(Verb.POST, UserResponse.RESOURCE + userBean.getId(), serializeBean(userBean));
		return ResponseAdapter.toUserResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public DirectsResponse fetchAllDirects() {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + DirectsResponse.RESOURCE, null);
		return ResponseAdapter.toDirectsResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public DirectResponse fetchDirect(String directUUID) {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + DirectResponse.RESOURCE + directUUID, null);
		return ResponseAdapter.toDirectResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public DirectResponse createDirect(BeanDirect directBean) {
		Response resp = connection.doRequest(Verb.POST, generateContextUrl() + DirectsResponse.RESOURCE, serializeBean(directBean));
		return ResponseAdapter.toDirectResponse(resp, ResponseAdapter.POST_CREATE_EXPECTED_CODE);
	}

	@Override
	public DirectResponse updateDirect(BeanDirect directBean) {
		Response resp = connection.doRequest(Verb.POST, generateContextUrl() + DirectResponse.RESOURCE + directBean.getId(), serializeBean(directBean));
		return ResponseAdapter.toDirectResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public DirectResponse deleteDirect(String directUUID) {
		Response resp = connection.doRequest(Verb.DELETE, generateContextUrl() + DirectResponse.RESOURCE + directUUID, null);
		return ResponseAdapter.toDirectResponse(resp, ResponseAdapter.DELETE_EXPECTED_CODE);
	}

	@Override
	public EndpointsResponse fetchAllEndpoints() {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + EndpointsResponse.RESOURCE, null);
		return ResponseAdapter.toEndpointsResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public EndpointResponse fetchEndpoint(String endpointUUID) {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + EndpointResponse.RESOURCE + endpointUUID, null);
		return ResponseAdapter.toEndpointResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public EndpointResponse createEndpoint(BeanEndpoint endpointBean) {
		Response resp = connection.doRequest(Verb.POST, generateContextUrl() + EndpointsResponse.RESOURCE, serializeBean(endpointBean));
		return ResponseAdapter.toEndpointResponse(resp, ResponseAdapter.POST_CREATE_EXPECTED_CODE);
	}

	@Override
	public EndpointResponse updateEndpoint(BeanEndpoint endpointBean) {
		Response resp = connection.doRequest(Verb.POST, generateContextUrl() + EndpointResponse.RESOURCE + endpointBean.getId(), serializeBean(endpointBean));
		return ResponseAdapter.toEndpointResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public EndpointResponse deleteEndpoint(String endpointUUID) {
		Response resp = connection.doRequest(Verb.DELETE, generateContextUrl() + EndpointResponse.RESOURCE + endpointUUID, null);
		return ResponseAdapter.toEndpointResponse(resp, ResponseAdapter.DELETE_EXPECTED_CODE);
	}

	@Override
	public ApplicationsResponse fetchAllApplications() {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + ApplicationsResponse.RESOURCE, null);
		return ResponseAdapter.toApplicationsResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public ApplicationResponse fetchApplication(String applicationUUID) {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + ApplicationResponse.RESOURCE + applicationUUID, null);
		return ResponseAdapter.toApplicationResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public ApplicationResponse createApplication(BeanApplication applicationBean) {
		Response resp = connection.doRequest(Verb.POST, generateContextUrl() + ApplicationsResponse.RESOURCE, serializeBean(applicationBean));
		return ResponseAdapter.toApplicationResponse(resp, ResponseAdapter.POST_CREATE_EXPECTED_CODE);
	}

	@Override
	public ApplicationResponse updateApplication(BeanApplication applicationBean) {
		Response resp = connection.doRequest(Verb.POST, generateContextUrl() + ApplicationResponse.RESOURCE + applicationBean.getId(), serializeBean(applicationBean));
		return ResponseAdapter.toApplicationResponse(resp, ResponseAdapter.POST_UPDATE_EXPECTED_CODE);
	}

	@Override
	public ApplicationResponse deleteApplication(String applicationUUID) {
		Response resp = connection.doRequest(Verb.DELETE, generateContextUrl() + ApplicationResponse.RESOURCE + applicationUUID, null);
		return ResponseAdapter.toApplicationResponse(resp, ResponseAdapter.DELETE_EXPECTED_CODE);
	}
	
	@Override
	public ServicesResponse fetchAllServiceIDs() {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + ServicesResponse.RESOURCE, null);
		return ResponseAdapter.toServicesResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public SourcesResponse fetchAllSourcesIDs(String serviceId) {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + SourcesResponse.RESOURCE + serviceId, null);
		return ResponseAdapter.toSourcesResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public ValuesResponse fetchSourceValues(String serviceId, String sourceId) {
		Response resp = connection.doRequest(Verb.GET, generateContextUrl() + ValuesResponse.RESOURCE + serviceId + "/" + sourceId, null);
		return ResponseAdapter.toValuesResponse(resp, ResponseAdapter.GET_EXPECTED_CODE);
	}

	@Override
	public SourcesResponse deleteSourceWithAllValues(String serviceId, String sourceId) {
		Response resp = connection.doRequest(Verb.DELETE, generateContextUrl() + SourcesResponse.RESOURCE + serviceId + "/" + sourceId, null);
		return ResponseAdapter.toSourcesResponse(resp, ResponseAdapter.DELETE_EXPECTED_CODE);
	}

	@Override
	public ValuesResponse deleteSingleValue(String serviceId, String sourceId,
			Long slotId) {
		Response resp = connection.doRequest(Verb.DELETE, generateContextUrl() + SourcesResponse.RESOURCE + serviceId + "/" + sourceId + "/" + slotId, null);
		return ResponseAdapter.toValuesResponse(resp, ResponseAdapter.DELETE_EXPECTED_CODE);
	}
}