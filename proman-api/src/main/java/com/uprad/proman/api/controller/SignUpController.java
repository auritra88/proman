package com.uprad.proman.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.upgrad.proman.api.model.SignupUserResponse;
import com.upgrad.proman.api.model.SignupUserRequest;


@RestController
@RequestMapping("/")
public class SignUpController {


    @RequestMapping(method = RequestMethod.POST,path = "/signup",consumes= MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupUserResponse> signup(final SignupUserRequest signupUserRequest){
        return new ResponseEntity(HttpStatus.OK);
    }
}
