package com.fastcampus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * packageName    : config
 * fileName       : Config
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
@EnableWebMvc
@ComponentScan("com.fastcampus.springpractice") // 여기를 루트로 삼아서 이 이하에 있는 모든 Spring Bean을 스캔하겠다.
@Configuration
public class Config {
}
