package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.BeanConfiguration;
import dev.mfikri.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    }

    @Test
    void testCreateBean() {
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    void testGetBean() {
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);


    }
}

