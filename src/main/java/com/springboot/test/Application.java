package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /* 스프링부트의 애플리케이션 클래스라는 어노테이션 이것만 보고도 스프링 부트라고 알 수있 다 */
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
