package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
