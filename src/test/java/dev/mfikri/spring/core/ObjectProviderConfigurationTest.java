package dev.mfikri.spring.core;


import dev.mfikri.spring.core.configuration.ObjectProviderConfiguration;
import dev.mfikri.spring.core.data.Foo;
import dev.mfikri.spring.core.data.MultiFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ObjectProviderConfigurationTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ObjectProviderConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testOptional() {
        MultiFoo bean = applicationContext.getBean(MultiFoo.class);

        List<Foo> foos = bean.getFoos();

        Assertions.assertEquals(3, foos.size());

    }
}
