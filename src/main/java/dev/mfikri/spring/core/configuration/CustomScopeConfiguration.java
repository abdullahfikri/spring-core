package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Bar;
import dev.mfikri.spring.core.data.Foo;
import dev.mfikri.spring.core.scope.DoubleScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class CustomScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo () {
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public static CustomScopeConfigurer customScopeConfigurer () {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubleScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar () {
        log.info("create new bar");
        return  new Bar();
    }
}
