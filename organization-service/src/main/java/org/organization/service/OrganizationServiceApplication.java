package org.organization.service;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Hello world!
 *
 */
public class OrganizationServiceApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

	@Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
                .apis(RequestHandlerSelectors.basePackage("pl.piomin.services.organization.controller"))
                .paths(PathSelectors.any())
            .build()
            .apiInfo(new ApiInfoBuilder().version("1.0").title("Organization API").
            		description("Documentation Employee API v1.0").build());
    }

}
