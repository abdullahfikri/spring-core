package dev.mfikri.spring.core;

import dev.mfikri.spring.core.util.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    void testSingleTon() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        Assertions.assertEquals(database1, database2);
    }
}
