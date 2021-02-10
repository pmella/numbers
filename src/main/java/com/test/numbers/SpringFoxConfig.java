package com.test.numbers;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    private ApiInfo apiInfo() {
        return new ApiInfo("Numbers paths API",
                "This is a REST API that returns the path for a given positive integer number after performing repeteadly, either a multiplication by 3 or sum increment by 5. ",
                "1.0", "", new Contact("Pablo Mella", "", "pablo.mella.r@gmail.com"), "", "",
                Collections.emptyList());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage( "com.test.numbers" ) )
                .paths(PathSelectors.any()).build();
    }

}
