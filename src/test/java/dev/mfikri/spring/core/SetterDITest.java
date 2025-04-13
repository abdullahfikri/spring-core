package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.ConstructorDIConfiguration;
import dev.mfikri.spring.core.configuration.SetterDIConfiguration;
import dev.mfikri.spring.core.repository.CategoryRepository;
import dev.mfikri.spring.core.repository.ProductRepository;
import dev.mfikri.spring.core.service.CategoryService;
import dev.mfikri.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterDITest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(SetterDIConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {

        CategoryService service = applicationContext.getBean(CategoryService.class);
        Assertions.assertNotNull(service);

        CategoryRepository repository = applicationContext.getBean(CategoryRepository.class);
        Assertions.assertSame(repository, service.getCategoryRepository());



    }
}
