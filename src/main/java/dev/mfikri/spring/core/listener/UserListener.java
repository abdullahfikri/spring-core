package dev.mfikri.spring.core.listener;

import dev.mfikri.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent (LoginSuccessEvent event) {
        log.info("User listener on success login for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent2 (LoginSuccessEvent event) {
        log.info("User listener on success login for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent3 (LoginSuccessEvent event) {
        log.info("User listener on success login for user {}", event.getUser());
    }
}
