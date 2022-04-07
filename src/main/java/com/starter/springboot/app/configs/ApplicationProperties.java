package com.starter.springboot.app.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {
  
  @Value("${app.api.generic.base.url}")
  private String genericApiUrl;

  @Value("${app.api.generic.auth.username}")
  private String genericApiAuthUsername;
  public String getGenericApiUrl() {
    return genericApiUrl;
  }

  public void setGenericApiUrl(String genericApiUrl) {
    this.genericApiUrl = genericApiUrl;
  }  
}
