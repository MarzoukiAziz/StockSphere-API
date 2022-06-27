package com.moazmar.stocksphere.controller.api;

import static com.moazmar.stocksphere.utils.Constants.AUTHENTICATION_ENDPOINT;

import com.moazmar.stocksphere.dto.auth.AuthenticationRequest;
import com.moazmar.stocksphere.dto.auth.AuthenticationResponse;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("authentication")
public interface AuthenticationApi {

  @PostMapping(AUTHENTICATION_ENDPOINT + "/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);

}
