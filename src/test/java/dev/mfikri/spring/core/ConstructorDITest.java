package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.ComponentConfiguration;
import dev.mfikri.spring.core.configuration.ConstructorDIConfiguration;
import dev.mfikri.spring.core.repository.ProductRepository;
import dev.mfikri.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorDITest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ConstructorDIConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {

        ProductService service = applicationContext.getBean(ProductService.class);
        Assertions.assertNotNull(service);

        ProductRepository repository = applicationContext.getBean(ProductRepository.class);
        Assertions.assertSame(repository, service.getProductRepository());



    }
}
