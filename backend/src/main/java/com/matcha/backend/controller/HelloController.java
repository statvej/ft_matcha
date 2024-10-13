package com.matcha.backend.controller;

import com.matcha.backend.model.ResponseMessage;
import org.openapitools.api.HelloApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {

  @Override
  public ResponseEntity<ResponseMessage> getGreeting() {
    return ResponseEntity.ok(new ResponseMessage().message("Hello, world!"));
  }
}
