package dev.mfikri.spring.core.application;

import dev.mfikri.spring.core.data.Foo;
import dev.mfikri.spring.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class ListenerApps {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringApplicationApps.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingListener()));

        application.run(args);
    }
}
