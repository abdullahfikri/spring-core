package dev.mfikri.spring.core.configuration.subconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "dev.mfikri.spring.core.configuration.subconfig"
})
public class ScanConfiguration {
}
