package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Connection;
import org.springframework.context.annotation.Bean;

public class LifeCycleConfiguration {

    @Bean
    public Connection connection () {
        return new Connection();
    }
}
