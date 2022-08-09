package com.example.swaggertest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@OpenAPIDefinition(
        info = @Info(title = "API 명세서",
                description = "API 명세서 테스트 입니다.",
                version = "v0.1"))
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.swaggertest.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Practice Swagger")
                .description("practice swagger config")
                .version("1.0")
                .build();
    }
}