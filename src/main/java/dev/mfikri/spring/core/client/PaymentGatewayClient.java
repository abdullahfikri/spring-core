package dev.mfikri.spring.core.client;

import lombok.Data;

// Sebagai contoh class third party library yang tidak dapat diedit
@Data
public class PaymentGatewayClient {
    private String endpoint;
    private String privateKey;
    private String publicKey;
}
