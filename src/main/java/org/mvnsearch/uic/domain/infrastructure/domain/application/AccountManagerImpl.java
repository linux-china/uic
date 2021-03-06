package org.mvnsearch.uic.domain.infrastructure.domain.application;


import org.mvnsearch.uic.domain.application.AccountManager;
import org.mvnsearch.uic.domain.model.Account;
import org.mvnsearch.uic.domain.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * application manager implementation
 *
 * @author linux_china
 */
@Component
public class AccountManagerImpl implements AccountManager {

    @Autowired
    AccountRepository accountRepository;
    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email).get();
    }
}
