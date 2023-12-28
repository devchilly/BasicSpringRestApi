package com.chilly.basicspringrestapi.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="User not found.")
public class UserNotFoundException extends RuntimeException{}
