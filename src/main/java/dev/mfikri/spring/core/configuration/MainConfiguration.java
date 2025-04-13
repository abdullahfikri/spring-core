package dev.mfikri.spring.core.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
