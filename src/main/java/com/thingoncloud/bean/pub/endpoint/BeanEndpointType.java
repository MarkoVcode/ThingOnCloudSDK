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
package com.thingoncloud.bean.pub.endpoint;

import java.io.Serializable;
import java.math.BigDecimal;

public class BeanEndpointType implements Serializable {

	private static final long serialVersionUID = 8405175005401898526L;

	private String switchType;
	private String trueValue;
	private String falseValue;
	private String trueLiteral;
	private String falseLiteral;

	private String unit;
	private BigDecimal maxLimit;
	private BigDecimal minLimit;
	private BigDecimal maxValue;
	private BigDecimal minValue;
	private Boolean threshold;

	private String colorFormat;
	private String coordinatesFormat;

	public String getSwitchType() {
		return switchType;
	}

	public void setSwitchType(String switchType) {
		this.switchType = switchType;
	}

	public String getTrueValue() {
		return trueValue;
	}

	public void setTrueValue(String trueValue) {
		this.trueValue = trueValue;
	}

	public String getFalseValue() {
		return falseValue;
	}

	public void setFalseValue(String falseValue) {
		this.falseValue = falseValue;
	}

	public String getTrueLiteral() {
		return trueLiteral;
	}

	public void setTrueLiteral(String trueLiteral) {
		this.trueLiteral = trueLiteral;
	}

	public String getFalseLiteral() {
		return falseLiteral;
	}

	public void setFalseLiteral(String falseLiteral) {
		this.falseLiteral = falseLiteral;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(BigDecimal maxLimit) {
		this.maxLimit = maxLimit;
	}

	public BigDecimal getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(BigDecimal minLimit) {
		this.minLimit = minLimit;
	}

	public BigDecimal getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(BigDecimal maxValue) {
		this.maxValue = maxValue;
	}

	public BigDecimal getMinValue() {
		return minValue;
	}

	public void setMinValue(BigDecimal minValue) {
		this.minValue = minValue;
	}

	public Boolean getThreshold() {
		return threshold;
	}

	public void setThreshold(Boolean threshold) {
		this.threshold = threshold;
	}

	public String getColorFormat() {
		return colorFormat;
	}

	public void setColorFormat(String colorFormat) {
		this.colorFormat = colorFormat;
	}

	public String getCoordinatesFormat() {
		return coordinatesFormat;
	}

	public void setCoordinatesFormat(String coordinatesFormat) {
		this.coordinatesFormat = coordinatesFormat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BeanEndpointType [switchType=").append(switchType)
				.append(", trueValue=").append(trueValue)
				.append(", falseValue=").append(falseValue)
				.append(", trueLiteral=").append(trueLiteral)
				.append(", falseLiteral=").append(falseLiteral)
				.append(", unit=").append(unit).append(", maxLimit=")
				.append(maxLimit).append(", minLimit=").append(minLimit)
				.append(", maxValue=").append(maxValue).append(", minValue=")
				.append(minValue).append(", threshold=").append(threshold)
				.append(", colorFormat=").append(colorFormat)
				.append(", coordinatesFormat=").append(coordinatesFormat)
				.append("]");
		return builder.toString();
	}

}
