package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
  @RequestMapping("/")
  @ResponseBody
  public String sayHello() {
    return "Hello World Version1 from Host:" + getHostName();
  }

  private String getHostName()
  {
    try
    {
      InetAddress addr;
      addr = InetAddress.getLocalHost();
      return addr.getHostName();
    }
    catch (UnknownHostException ex)
    {
      throw new RuntimeException("Hostname can not be resolved");
    }
  }
}
