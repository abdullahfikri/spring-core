package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }
}
