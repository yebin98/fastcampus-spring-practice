package com.fastcampus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc // spring프로젝트 실행 시 사용됨
@ComponentScan("com.fastcampus.springpractice") // 여기를 루트로 삼아서 이 이하에 있는 모든 Spring Bean을 스캔하겠다.
@Configuration
public class Config {
}
