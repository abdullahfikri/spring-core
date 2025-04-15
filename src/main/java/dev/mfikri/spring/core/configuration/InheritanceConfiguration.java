package dev.mfikri.spring.core.configuration;

import dev.mfikri.spring.core.service.MerchantServiceImpl;
import dev.mfikri.spring.core.service.MerchantServiceImplPro;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MerchantServiceImpl.class, MerchantServiceImplPro.class})
public class InheritanceConfiguration {
}
