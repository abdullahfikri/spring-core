package dev.mfikri.spring.core.configuration.subconfig;

import dev.mfikri.spring.core.repository.CustomerRepository2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfiguration {

    @Primary
    @Bean
    public CustomerRepository2 normalCustomerRepository() {
        return new CustomerRepository2();
    }

    @Bean
    public CustomerRepository2 premiumCustomerRepository() {
        return new CustomerRepository2();
    }
}
