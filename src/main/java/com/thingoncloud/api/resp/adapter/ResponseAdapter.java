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
package com.thingoncloud.api.resp.adapter;

import java.io.Serializable;

import org.scribe.model.Response;

import com.thingoncloud.api.json.JSONHelper;
import com.thingoncloud.api.resp.prv.WebUserCredentialsResponse;
import com.thingoncloud.api.resp.prv.WebUserResponse;
import com.thingoncloud.api.resp.pub.ApplicationResponse;
import com.thingoncloud.api.resp.pub.ApplicationsResponse;
import com.thingoncloud.api.resp.pub.DirectResponse;
import com.thingoncloud.api.resp.pub.DirectsResponse;
import com.thingoncloud.api.resp.pub.EndpointResponse;
import com.thingoncloud.api.resp.pub.EndpointsResponse;
import com.thingoncloud.api.resp.pub.EnvironmentResponse;
import com.thingoncloud.api.resp.pub.ServicesResponse;
import com.thingoncloud.api.resp.pub.SourcesResponse;
import com.thingoncloud.api.resp.pub.UserResponse;
import com.thingoncloud.api.resp.pub.UsersResponse;
import com.thingoncloud.api.resp.pub.ValuesResponse;
import com.thingoncloud.api.resp.srv.DirectServiceValueResponse;
import com.thingoncloud.api.resp.srv.DirectServiceValuesResponse;
import com.thingoncloud.bean.BeanEnvironment;
import com.thingoncloud.bean.BeanError;
import com.thingoncloud.bean.prv.BeanWebUser;
import com.thingoncloud.bean.prv.BeanWebUserCredentials;
import com.thingoncloud.bean.pub.BeanUser;
import com.thingoncloud.bean.pub.BeanUsers;
import com.thingoncloud.bean.pub.application.BeanApplication;
import com.thingoncloud.bean.pub.application.BeanApplications;
import com.thingoncloud.bean.pub.direct.BeanDirect;
import com.thingoncloud.bean.pub.direct.BeanDirects;
import com.thingoncloud.bean.pub.endpoint.BeanEndpoint;
import com.thingoncloud.bean.pub.endpoint.BeanEndpoints;
import com.thingoncloud.bean.pub.values.BeanServices;
import com.thingoncloud.bean.pub.values.BeanSources;
import com.thingoncloud.bean.pub.values.BeanValues;
import com.thingoncloud.bean.srv.direct.BeanDirectSourceValue;
import com.thingoncloud.bean.srv.direct.BeanDirectSourceValues;

public class ResponseAdapter {
	
	public static final int GET_EXPECTED_CODE = 200;
	public static final int DELETE_EXPECTED_CODE = 204;
	public static final int POST_CREATE_EXPECTED_CODE = 201;
	public static final int POST_UPDATE_EXPECTED_CODE = 200;
	/**
	 * @param args
	 */
	public static UsersResponse toUsersResponse(Response resp, int expectedCode) {
		UsersResponse ur = new UsersResponse();
		ur.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				ur.setReturnBean((BeanUsers)deSerialize(resp.getBody(), BeanUsers.class));
		} else {
			ur.setErrorBean(deSerializeErrorBean(resp));
		}
		return ur;
	}

	public static UserResponse toUserResponse(Response resp, int expectedCode) {
		UserResponse ur = new UserResponse();
		ur.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				ur.setReturnBean((BeanUser)deSerialize(resp.getBody(), BeanUser.class));
		} else {
			ur.setErrorBean(deSerializeErrorBean(resp));
		}
		return ur;
	}
	
	public static DirectsResponse toDirectsResponse(Response resp, int expectedCode) {
		DirectsResponse dr = new DirectsResponse();
		dr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				dr.setReturnBean((BeanDirects)deSerialize(resp.getBody(), BeanDirects.class));
		} else {
			dr.setErrorBean(deSerializeErrorBean(resp));
		}
		return dr;
	}
	
	public static DirectResponse toDirectResponse(Response resp, int expectedCode) {
		DirectResponse dr = new DirectResponse();
		dr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				dr.setReturnBean((BeanDirect)deSerialize(resp.getBody(), BeanDirect.class));
		} else {
			dr.setErrorBean(deSerializeErrorBean(resp));
		}
		return dr;
	}
	
	public static ApplicationsResponse toApplicationsResponse(Response resp, int expectedCode) {
		ApplicationsResponse ar = new ApplicationsResponse();
		ar.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				ar.setReturnBean((BeanApplications)deSerialize(resp.getBody(), BeanApplications.class));
		} else {
			ar.setErrorBean(deSerializeErrorBean(resp));
		}
		return ar;
	}

	public static ApplicationResponse toApplicationResponse(Response resp, int expectedCode) {
		ApplicationResponse ar = new ApplicationResponse();
		ar.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				ar.setReturnBean((BeanApplication)deSerialize(resp.getBody(), BeanApplication.class));
		} else {
			ar.setErrorBean(deSerializeErrorBean(resp));
		}
		return ar;
	}
	
	public static EndpointsResponse toEndpointsResponse(Response resp, int expectedCode) {
		EndpointsResponse er = new EndpointsResponse();
		er.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				er.setReturnBean((BeanEndpoints)deSerialize(resp.getBody(), BeanEndpoints.class));
		} else {
			er.setErrorBean(deSerializeErrorBean(resp));
		}
		return er;
	}

	public static EndpointResponse toEndpointResponse(Response resp, int expectedCode) {
		EndpointResponse er = new EndpointResponse();
		er.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				er.setReturnBean((BeanEndpoint)deSerialize(resp.getBody(), BeanEndpoint.class));
		} else {
			er.setErrorBean(deSerializeErrorBean(resp));
		}
		return er;
	}
	
	public static ServicesResponse toServicesResponse(Response resp, int expectedCode) {
		ServicesResponse sr = new ServicesResponse();
		sr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				sr.setReturnBean((BeanServices)deSerialize(resp.getBody(), BeanServices.class));
		} else {
			sr.setErrorBean(deSerializeErrorBean(resp));
		}
		return sr;
	}
	
	public static SourcesResponse toSourcesResponse(Response resp, int expectedCode) {
		SourcesResponse sr = new SourcesResponse();
		sr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				sr.setReturnBean((BeanSources)deSerialize(resp.getBody(), BeanSources.class));
		} else {
			sr.setErrorBean(deSerializeErrorBean(resp));
		}
		return sr;
	}
	
	public static ValuesResponse toValuesResponse(Response resp, int expectedCode) {
		ValuesResponse vr = new ValuesResponse();
		vr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				vr.setReturnBean((BeanValues)deSerialize(resp.getBody(), BeanValues.class));
		} else {
			vr.setErrorBean(deSerializeErrorBean(resp));
		}
		return vr;
	}
	
	public static DirectServiceValuesResponse toDirectServiceValuesResponse(Response resp, int expectedCode) {
		DirectServiceValuesResponse vr = new DirectServiceValuesResponse();
		vr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				vr.setReturnBean((BeanDirectSourceValues)deSerialize(resp.getBody(), BeanDirectSourceValues.class));
		} else {
			vr.setErrorBean(deSerializeErrorBean(resp));
		}
		return vr;
	}
	
	public static DirectServiceValueResponse toDirectServiceValueResponse(Response resp, int expectedCode) {
		DirectServiceValueResponse vr = new DirectServiceValueResponse();
		vr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				vr.setReturnBean((BeanDirectSourceValue)deSerialize(resp.getBody(), BeanDirectSourceValue.class));
		} else {
			vr.setErrorBean(deSerializeErrorBean(resp));
		}
		return vr;
	}
	
	public static WebUserResponse toWebUserResponse(Response resp, int expectedCode) {
		WebUserResponse vr = new WebUserResponse();
		vr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				vr.setReturnBean((BeanWebUser)deSerialize(resp.getBody(), BeanWebUser.class));
		} else {
			vr.setErrorBean(deSerializeErrorBean(resp));
		}
		return vr;
	}
	
	public static WebUserCredentialsResponse toWebUserCredentialsResponse(Response resp, int expectedCode) {
		WebUserCredentialsResponse vr = new WebUserCredentialsResponse();
		vr.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				vr.setReturnBean((BeanWebUserCredentials)deSerialize(resp.getBody(), BeanWebUserCredentials.class));
		} else {
			vr.setErrorBean(deSerializeErrorBean(resp));
		}
		return vr;
	}
	
	public static EnvironmentResponse toEnvironmentResponse(Response resp, int expectedCode) {
		EnvironmentResponse er = new EnvironmentResponse();
		er.setRawResponse(resp);
		if(resp.getCode() == expectedCode) {
			if(null != resp.getBody() || !resp.getBody().isEmpty())
				er.setReturnBean((BeanEnvironment)deSerialize(resp.getBody(), BeanEnvironment.class));
		} else {
			er.setErrorBean(deSerializeErrorBean(resp));
		}
		return er;
	}
	
	public static String serializeBean(Serializable bean) {
		JSONHelper jh = JSONHelper.getInstance();
		return jh.serialize(bean);
	}
	
	public static Serializable deSerialize(String json, Class<? extends Serializable> clazz) {
		JSONHelper jh = JSONHelper.getInstance();
		return jh.deSerialize(json, clazz);
	}

	private static BeanError deSerializeErrorBean(Response resp) {
		return (BeanError)deSerialize(resp.getBody(), BeanError.class);
	}
	
}
