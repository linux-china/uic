package org.mvnsearch.uic.domain.event;

import org.mvnsearch.ddd.domain.annotations.DomainEvent;
import org.mvnsearch.ddd.domain.events.BaseDomainEvent;
import org.mvnsearch.uic.domain.model.Account;

/**
 * account event
 *
 * @author linux_china
 */
@DomainEvent
public class AccountEvent extends BaseDomainEvent<Account> {
    public static String CREATED_TYPE = "created";
    public static String BLOCKED_TYPE = "blocked";

    public AccountEvent(String type, Account account) {
        setPayload(account);
    }
}
