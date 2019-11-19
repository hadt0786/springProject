package com.sutherland.ConfigClassSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigClass {
	
	@Bean("samsung1")
	public Samsung callSamsung() {
		return new Samsung();
	}

}
