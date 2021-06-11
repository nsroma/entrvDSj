package com.example.entrevueSpringBoot;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
@Override
protected void configure(HttpSecurity httpSecurity)throws Exception{
	httpSecurity.authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests()
	.antMatchers("/H2-console/**").permitAll();
	httpSecurity.csrf().disable();
	httpSecurity.headers().frameOptions().disable();
}
}
