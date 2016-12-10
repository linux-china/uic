package org.mvnsearch.uic.domain.infrastructure.domain.service;

import org.mvnsearch.ddd.domain.annotations.DomainEntity;
import org.mvnsearch.uic.domain.event.AccountEvent;
import org.mvnsearch.uic.domain.model.Account;
import org.mvnsearch.uic.domain.model.AccountRepository;
import org.mvnsearch.uic.domain.service.AccountService;
import org.mvnsearch.uic.domain.specification.AccountSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * account service implementation
 *
 * @author linux_china
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    @Autowired
    private AccountSpec accountSpec;
    @Autowired
    private AccountRepository accountRepository;

    public void create(Account account) {
        //todo implement create logic
        eventPublisher.publishEvent(new AccountEvent(AccountEvent.CREATED_TYPE, account));

    }

    public void updatePassword(Long accountId, String oldPassword, String newPassword) {

    }

    public void resetPassword(Long accountId) {

    }


}
