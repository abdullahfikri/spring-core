package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.ConstructorDIConfiguration;
import dev.mfikri.spring.core.configuration.FieldDIConfiguration;
import dev.mfikri.spring.core.repository.CustomerRepository;
import dev.mfikri.spring.core.repository.ProductRepository;
import dev.mfikri.spring.core.service.CustomerService;
import dev.mfikri.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldDITest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FieldDIConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {

        CustomerService service = applicationContext.getBean(CustomerService.class);
        Assertions.assertNotNull(service);

        CustomerRepository repository = applicationContext.getBean(CustomerRepository.class);
        Assertions.assertSame(repository, service.getCustomerRepository());



    }
}
