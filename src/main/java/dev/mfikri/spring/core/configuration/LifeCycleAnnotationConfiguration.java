package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.Connection;
import dev.mfikri.spring.core.data.Server;
import dev.mfikri.spring.core.data.Server2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleAnnotationConfiguration {

    @Bean
    public Connection connection () {
        return new Connection();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server() {
        return new Server();
    }

    @Bean
    public Server2 server2() {
        return new Server2();
    }
}
