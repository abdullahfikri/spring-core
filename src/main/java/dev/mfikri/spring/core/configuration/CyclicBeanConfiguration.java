package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.data.cyclic.CyclicA;
import dev.mfikri.spring.core.data.cyclic.CyclicB;
import dev.mfikri.spring.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicBeanConfiguration {
    @Bean
    public CyclicA cyclicA (CyclicB cyclicB) {
        return new CyclicA();
    }

    @Bean
    public CyclicB cyclicB (CyclicC cyclicC) {
        return new CyclicB();
    }

    @Bean
    public CyclicC cyclicC (CyclicA cyclicA) {
        return new CyclicC();
    }

}
