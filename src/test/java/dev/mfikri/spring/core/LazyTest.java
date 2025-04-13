package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.DependsOnConfiguration;
import dev.mfikri.spring.core.configuration.LazyConfiguration;
import dev.mfikri.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyTest {
    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LazyConfiguration.class);
    }

    @Test
    void testLazy() {
    }

    @Test
    void getLazy() {
        Foo foo = context.getBean(Foo.class);
    }
}
