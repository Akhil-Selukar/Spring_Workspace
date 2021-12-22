package com.acecorp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@ComponentScan("com.acecorp")
public class WebSecurityConfig {
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder()
				.username("admin")
				.password("1234")
				.roles("ADMIN").build());
		return manager;
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/").authorizeRequests().anyRequest().hasRole("ADMIN").and().httpBasic();
	}
}
