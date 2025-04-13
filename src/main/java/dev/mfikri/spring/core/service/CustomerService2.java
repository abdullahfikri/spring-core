package dev.mfikri.spring.core.service;

import dev.mfikri.spring.core.repository.CustomerRepository;
import dev.mfikri.spring.core.repository.CustomerRepository2;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CustomerService2 {
    private CustomerRepository2 premiumCustomerRepository;

    @Autowired
    @Qualifier("normalCustomerRepository")
    private CustomerRepository2 normalCustomerRepository;


    public CustomerService2(@Qualifier("premiumCustomerRepository") CustomerRepository2 premiumCustomerRepository) {
        this.premiumCustomerRepository = premiumCustomerRepository;
    }
}
