package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.InheritanceConfiguration;
import dev.mfikri.spring.core.service.MerchantService;
import dev.mfikri.spring.core.service.MerchantServiceImpl;
import dev.mfikri.spring.core.service.MerchantServiceImplPro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance() {

        // Error karena MerchantService memiliki lebih dari satu class turunan.
        // Success apabila MerchantService hanya memiliki satu class turunan
        // MerchantService merchantService = applicationContext.getBean(MerchantService.class);


        MerchantService merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);
        MerchantService merchantServiceImplPro = applicationContext.getBean(MerchantServiceImplPro.class);

        // Assertions.assertSame(merchantService, merchantServiceImpl );
        Assertions.assertNotSame(merchantServiceImplPro, merchantServiceImpl );


    }
}
