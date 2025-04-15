package dev.mfikri.spring.core;

import dev.mfikri.spring.core.data.Car;
import dev.mfikri.spring.core.processor.IdGeneratorBeanPostProcessor;
import dev.mfikri.spring.core.processor.PrefixIdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderedTest {

    @Configuration
    @ComponentScan(basePackages = {
            "dev.mfikri.spring.core.data"
    })
    @Import({
            IdGeneratorBeanPostProcessor.class,
            PrefixIdGeneratorBeanPostProcessor.class,
    })
    public static class TestConfig {}
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testPostProcessor() {
        Car bean = applicationContext.getBean(Car.class);
        System.out.println(bean.getId());

        Assertions.assertNotNull(bean.getId());
        Assertions.assertTrue(bean.getId().startsWith("WDR-"));


    }
}
