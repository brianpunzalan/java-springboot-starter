package com.starter.springboot.app.models;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component(value = "apiRequestPayloadModel")
public class ApiRequestPayload extends HashMap<String, Object> {}
