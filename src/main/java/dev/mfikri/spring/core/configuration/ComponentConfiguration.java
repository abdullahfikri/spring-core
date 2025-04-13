package dev.mfikri.spring.core.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "dev.mfikri.spring.core.service",
})
public class ComponentConfiguration {
}
