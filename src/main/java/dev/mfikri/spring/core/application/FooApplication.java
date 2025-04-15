package dev.mfikri.spring.core.application;

import dev.mfikri.spring.core.data.Bar;
import dev.mfikri.spring.core.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

    @Bean(value = "FooFirst")
    public Foo foo (Bar bar) {
        return new Foo();
    }

    @Bean Bar bar () {
        return new Bar();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);

        Foo foo = applicationContext.getBean(Foo.class);

        System.out.println(foo);


    }
}
