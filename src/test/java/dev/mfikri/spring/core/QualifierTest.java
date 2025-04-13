package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.FieldDIConfiguration;
import dev.mfikri.spring.core.configuration.QualifierConfiguration;
import dev.mfikri.spring.core.repository.CustomerRepository;
import dev.mfikri.spring.core.repository.CustomerRepository2;
import dev.mfikri.spring.core.service.CustomerService;
import dev.mfikri.spring.core.service.CustomerService2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {

        CustomerService2 service = applicationContext.getBean(CustomerService2.class);
        Assertions.assertNotNull(service);

        CustomerRepository2 normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository2.class);
        CustomerRepository2 premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository2.class);
        Assertions.assertSame(normalCustomerRepository, service.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, service.getPremiumCustomerRepository());



    }
}
