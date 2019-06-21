package com.eric.swagger.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfiguration
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {



        @Bean
        public Docket buildDocket(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(buildApiInf())
                    .select()
                //     .apis(RequestHandlerSelectors.any())
                    .apis(RequestHandlerSelectors.basePackage("com.eric.swagger.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }
    
        private ApiInfo buildApiInf(){
            return new ApiInfoBuilder()
                        .title("swagger ui")
                        .description("测试demo")
                        .termsOfServiceUrl("termsOfServiceUrl")
                        .contact(new Contact("eric-gao", "http://39.107.137.53:9393", "ericgaowork@163.com"))
                        .build();
    
    
        }
    
}