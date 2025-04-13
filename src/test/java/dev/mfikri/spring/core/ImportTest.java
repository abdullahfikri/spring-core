package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.MainConfiguration;
import dev.mfikri.spring.core.data.Bar;
import dev.mfikri.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(MainConfiguration.class);
    }

    @Test
    void testImport() {
        Foo foo = context.getBean(Foo.class);
        Bar bean = context.getBean(Bar.class);

    }
}
