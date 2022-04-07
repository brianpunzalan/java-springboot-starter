package com.starter.springboot.app.controllers;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ApiController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

  @RequestMapping(value="/health", method=RequestMethod.GET)
  public ResponseEntity<String> health() {
    LOGGER.info("/health");
    ResponseEntity<String> entity = ResponseEntity.ok().build();
    return entity;
  }

  @RequestMapping(value="/hello", method=RequestMethod.POST)
  public ResponseEntity<String> hello(@RequestBody Map<String, String> params) {
    LOGGER.info("/hello");
    ResponseEntity<String> entity = ResponseEntity.ok().build();
    return entity;
  }
}
