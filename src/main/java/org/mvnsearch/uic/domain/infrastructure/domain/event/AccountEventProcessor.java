package org.mvnsearch.uic.domain.infrastructure.domain.event;

import org.mvnsearch.uic.domain.event.AccountEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * account processor implementation
 *
 * @author linux_china
 */
@Component
public class AccountEventProcessor  {

    @EventListener(AccountEvent.class)
    public void handleAccountCreate(AccountEvent accountEvent) {
        //todo


    }
}
