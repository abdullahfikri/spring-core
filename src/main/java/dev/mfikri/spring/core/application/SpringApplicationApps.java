package dev.mfikri.spring.core.application;

import dev.mfikri.spring.core.data.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringApplicationApps {

    @Bean(value = "FooApp")
    public Foo foo () {
        return  new Foo();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringApplicationApps.class);
        application.setBannerMode(Banner.Mode.OFF);

        ConfigurableApplicationContext applicationContext = application.run(args);
        applicationContext.getBean("FooApp", Foo.class);
    }
}
