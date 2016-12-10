package org.mvnsearch.uic.domain.infrastructure.domain.model;


import org.mvnsearch.uic.domain.model.Account;
import org.mvnsearch.uic.domain.model.AccountRepository;

import java.util.Optional;

/**
 * account repository implementation
 *
 * @author linux_china
 */
public class AccountRepositoryImpl implements AccountRepository {
    public void create(Account account) {

    }

    public void update(Account account) {

    }

    public Optional<Account> findOne(long id) {
        return null;
    }

    @Override
    public Optional<Account> findByEmail(String email) {
        return null;
    }
}
