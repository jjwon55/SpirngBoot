package com.aloha.swagger.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public GroupedOpenApi pubApi() {
        return GroupedOpenApi.builder()
                            .group("group-aloha")
                            .pathsToMatch("/api/**", "/posts/**")
                            .build()
                            ;
    }
    @Bean   
    public OpenAPI SpringTestOpenAPI() {
        return new OpenAPI()
                        .info(new Info().title("Test Project API")
                                        .description("테스트 프로젝트 API 입니다.")
                                        .version("v0.0.1")
                        
                        );
    }
}
