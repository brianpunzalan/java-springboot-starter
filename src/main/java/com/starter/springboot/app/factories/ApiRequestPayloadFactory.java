package com.starter.springboot.app.factories;

import com.starter.springboot.app.batch.impact.models.ApiRequestPayload;

import org.springframework.beans.factory.FactoryBean;

public class ApiRequestPayloadFactory implements FactoryBean<ApiRequestPayload> {

	@Override
	public ApiRequestPayload getObject() throws Exception {
		return new ApiRequestPayload();
	}

	@Override
	public Class<?> getObjectType() {
		return ApiRequestPayload.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
