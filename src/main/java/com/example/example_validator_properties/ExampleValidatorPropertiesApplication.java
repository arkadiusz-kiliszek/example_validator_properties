package com.example.example_validator_properties;

import com.example.config.ExampleProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleValidatorPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleValidatorPropertiesApplication.class, args);
    }

}
