package dev.mfikri.spring.core;


import dev.mfikri.spring.core.listener.LoginSuccessListener;
import dev.mfikri.spring.core.listener.UserListener;
import dev.mfikri.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            UserListener.class
    })

    public static class TestConfiguration {
        
    }
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEventListener() {

        UserService userService = applicationContext.getBean(UserService.class);

        userService.login("admin", "admin");
        userService.login("fikri", "fikri");
        userService.login("admin", "admin");

    }
}
