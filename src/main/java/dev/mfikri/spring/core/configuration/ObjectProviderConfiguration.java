package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "dev.mfikri.spring.core.configuration.subconfig",
})
@Import(MultiFoo.class)
public class ObjectProviderConfiguration {
}
