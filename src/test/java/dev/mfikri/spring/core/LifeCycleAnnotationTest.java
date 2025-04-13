package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.LifeCycleAnnotationConfiguration;
import dev.mfikri.spring.core.configuration.LifeCycleConfiguration;
import dev.mfikri.spring.core.data.Connection;
import dev.mfikri.spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleAnnotationTest {
    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleAnnotationConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // context.close();
    }

    @Test
    void testConnection() {
        Server server = context.getBean(Server.class);
    }
}
