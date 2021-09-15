package com.sittingmgtpro.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@EnableWebSecurity
@Configuration
public class WebSecurityConfigurations extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("user").password("user").roles("USER")
			.and()
			.withUser("admin").password("admin").roles("ADMIN")
			;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/SittingMgtPro").permitAll();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
*/