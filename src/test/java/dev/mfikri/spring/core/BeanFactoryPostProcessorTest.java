package dev.mfikri.spring.core;

import dev.mfikri.spring.core.data.Foo;
import dev.mfikri.spring.core.processor.FooBeanFactoryPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class BeanFactoryPostProcessorTest {

    @Configuration
    @Import(FooBeanFactoryPostProcessor.class)
    public static class TestConfiguration {}

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactoryPostProcessor() {
        Foo bean = applicationContext.getBean(Foo.class);
        Assertions.assertNotNull(bean);
        String[] beanNames = applicationContext.getBeanNamesForType(Foo.class);
        Assertions.assertEquals("foo-bean-factory", beanNames[0]);
    }
}
