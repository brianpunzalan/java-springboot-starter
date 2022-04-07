package com.starter.springboot.app.configs;

import com.starter.springboot.app.batch.impact.factories.ApiRequestPayloadFactory;
import com.starter.springboot.app.batch.impact.models.ApiRequestPayload;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

	@Bean(name = "apiRequestPayload")
	public ApiRequestPayloadFactory apiRequestPayloadFactory() {
		return new ApiRequestPayloadFactory();
	}
	
	@Bean
	public ApiRequestPayload apiRequestPayload() throws Exception {
		return apiRequestPayloadFactory().getObject();
  }
}
