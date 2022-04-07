package com.starter.springboot.app.services;

import org.springframework.http.HttpEntity;

public interface ApiService<P, R> {
  public R call(P payload) throws Exception;
  public HttpEntity<P> setupRequest(P payload);
  public String getServiceUrl();
}
