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
package com.thingoncloud.bean;

import java.io.Serializable;

public class BeanEnvironment implements Serializable {

	private static final long serialVersionUID = -2380851898642640861L;
	
	private String environment;
	private String release;
	private String buildTag;
	private String buildDate;
	private boolean jobsEnabled;
	private String sqlVersion;
	private Long currentTimestamp;
	private String currentDate;

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getBuildTag() {
		return buildTag;
	}

	public void setBuildTag(String buildTag) {
		this.buildTag = buildTag;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public boolean isJobsEnabled() {
		return jobsEnabled;
	}

	public void setJobsEnabled(boolean jobsEnabled) {
		this.jobsEnabled = jobsEnabled;
	}

	public String getSqlVersion() {
		return sqlVersion;
	}

	public void setSqlVersion(String sqlVersion) {
		this.sqlVersion = sqlVersion;
	}

	public Long getCurrentTimestamp() {
		return currentTimestamp;
	}

	public void setCurrentTimestamp(Long currentTimestamp) {
		this.currentTimestamp = currentTimestamp;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanEnvironment [environment=").append(environment)
				.append(", release=").append(release).append(", buildTag=")
				.append(buildTag).append(", buildDate=").append(buildDate)
				.append(", jobsEnabled=").append(jobsEnabled)
				.append(", sqlVersion=").append(sqlVersion)
				.append(", currentTimestamp=").append(currentTimestamp)
				.append(", currentDate=").append(currentDate).append("]");
		return builder.toString();
	}

	
}
