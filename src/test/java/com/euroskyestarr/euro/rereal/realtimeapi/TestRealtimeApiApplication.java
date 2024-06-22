package com.euroskyestarr.euro.rereal.realtimeapi;

import org.springframework.boot.SpringApplication;

public class TestRealtimeApiApplication {

  public static void main(String[] args) {
    SpringApplication.from(RealtimeApiApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
