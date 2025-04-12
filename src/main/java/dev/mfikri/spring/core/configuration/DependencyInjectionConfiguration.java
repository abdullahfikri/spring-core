package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Bar;
import dev.mfikri.spring.core.data.Foo;
import dev.mfikri.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar () {
        return new Bar();
    }

    @Bean
    public FooBar fooBar (@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
