package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.DependsOnConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
    @Test
    void testDependsOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);

    }
}
