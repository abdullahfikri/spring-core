package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.subconfig.ScanConfiguration;
import dev.mfikri.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    }

    @Test
    void testScan() {
        Foo bean = context.getBean("foo", Foo.class);
    }
}
