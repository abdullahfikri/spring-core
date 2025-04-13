package dev.mfikri.spring.core.factory;

import dev.mfikri.spring.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component(value = "paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://example.com");
        client.setPrivateKey("privatesecret");
        client.setPublicKey("publickey123");

        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
