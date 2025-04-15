package dev.mfikri.spring.core;

import dev.mfikri.spring.core.application.FooApplication;
import dev.mfikri.spring.core.application.FooApplicationError;
import dev.mfikri.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplicationError.class)
public class FooApplicationErrorTest {
    @Autowired
    Foo foo;

    @Test
    void testFoo() {
        Assertions.assertNotNull(foo);
    }
}
