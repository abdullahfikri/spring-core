package dev.mfikri.spring.core.processor;

import dev.mfikri.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id generator Processor for bean {}", beanName);
        if (bean instanceof IdAware idAware){
            log.info("Set Id for bean {}", beanName);
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }

    // the least number will be executed first
    @Override
    public int getOrder() {
        return 1;
    }
}
