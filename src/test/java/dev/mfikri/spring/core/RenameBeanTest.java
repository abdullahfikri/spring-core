package dev.mfikri.spring.core;

import dev.mfikri.spring.core.configuration.PrimaryDuplicateConfiguration;
import dev.mfikri.spring.core.configuration.RenameBeanConfiguration;
import dev.mfikri.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RenameBeanTest {
    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(RenameBeanConfiguration.class);

        Foo primary = context.getBean(Foo.class);
        Foo foo1 = context.getBean("fooFirst", Foo.class);
        Foo foo2 = context.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo1, primary);
        Assertions.assertNotSame(primary, foo2);


    }
}
