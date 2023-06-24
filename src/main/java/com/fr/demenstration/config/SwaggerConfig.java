package com.fr.demenstration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    Docket docket() {
		
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.fr.demenstration.controller"))
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
		
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Person API Documentation")
				.version("1.0")
				.description("This documentation is for WEB-ATRIO project. It shows all APIs you can access. Note that, please remove it before publishing to production.")
				.contact(new Contact("PERSON", "https://person.com/---", "sekrafimom@gmail.com")).build();
	}

}
