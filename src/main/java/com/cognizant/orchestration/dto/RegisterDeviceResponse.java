package com.cognizant.orchestration.dto;

import com.cognizant.dto.BaseResponse;

public class RegisterDeviceResponse extends BaseResponse {

	private String deviceId;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
