package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar () {
        return new Bar();
    }
}
