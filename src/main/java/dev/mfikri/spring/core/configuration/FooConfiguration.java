package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
