package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.LifeCycleConfiguration;
import dev.mfikri.spring.core.data.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // context.close();
    }

    @Test
    void testConnection() {
        Connection connection = context.getBean(Connection.class);
    }
}
