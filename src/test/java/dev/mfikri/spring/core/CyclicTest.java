package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.CyclicBeanConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCyclic() {
        Assertions.assertThrows(UnsatisfiedDependencyException.class, () -> {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicBeanConfiguration.class);
        });
    }
}
