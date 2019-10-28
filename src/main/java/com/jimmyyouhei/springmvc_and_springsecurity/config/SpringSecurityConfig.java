package com.jimmyyouhei.springmvc_and_springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.jimmyyouhei.springmvc_and_springsecurity.entity.UserRole;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	private AuthenticationSuccessHandler loginSuccessHandler;
	
	@Autowired
	public SpringSecurityConfig(AuthenticationSuccessHandler loginSuccessHandler) {
		this.loginSuccessHandler = loginSuccessHandler;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(users.username("system").password("java").roles(UserRole.NORMAL.name()));
		
		auth.inMemoryAuthentication()
		.withUser(users.username("admin").password("passw0rd").roles(UserRole.ADMIN.name()));
		
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/admin/**").hasRole(UserRole.ADMIN.name())
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/loginPage")
		.loginProcessingUrl("/authenticateUser")
		.successHandler(loginSuccessHandler)
		.permitAll()
		.and()
		.logout().permitAll();
		
	}
	
	

	
}


