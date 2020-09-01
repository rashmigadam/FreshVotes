package com.freshvotes.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration  extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("dummytesting2020@yahoo.com").password("pwd12345").roles("USERS");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable()
		.authorizeRequests().antMatchers("/").permitAll().antMatchers("/login").permitAll()
		.anyRequest().hasRole("USER")
		.and().formLogin().loginPage("/login").permitAll()
		.and().logout().logoutUrl("/logout").permitAll();
	}

}
