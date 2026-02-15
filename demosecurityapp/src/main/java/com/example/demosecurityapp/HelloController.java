package com.example.demosecurityapp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/")
    public String greet(HttpServletRequest servletRequest){
      return "hello security      "+servletRequest.getSession().getId();
    }
}
