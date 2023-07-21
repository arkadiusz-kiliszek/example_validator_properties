package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Data
@Configuration
@Validated
@ConfigurationProperties(prefix = "test.examples")
public class ExampleProperties {
    @NotEmpty
    private String firstName;

    private String email;

    @AssertTrue(message = "one field id empty")
    public boolean isNotEmpty() {
        return Objects.nonNull(firstName) && Objects.nonNull(email);
    }
}
