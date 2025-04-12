package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RenameBeanConfiguration {
    @Primary
    @Bean("fooFirst")
    public Foo foo1 () {
        return new Foo();
    }

    @Bean("fooSecond")
    public Foo foo2 () {
        return new Foo();
    }
}
