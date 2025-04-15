package dev.mfikri.spring.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class LogCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Log command line args: {}", Arrays.toString(args));
    }
}
