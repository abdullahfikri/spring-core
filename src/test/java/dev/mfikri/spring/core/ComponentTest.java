package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.ComponentConfiguration;
import dev.mfikri.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {

        ProductService service = applicationContext.getBean(ProductService.class);
        ProductService service2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(service, service2);
    }
}
