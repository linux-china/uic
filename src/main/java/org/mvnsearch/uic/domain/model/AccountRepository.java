package org.mvnsearch.uic.domain.model;

import org.mvnsearch.ddd.domain.annotations.DomainRepository;

import java.util.Optional;

/**
 * account repository
 *
 * @author linux_china
 */
@DomainRepository
public interface AccountRepository {

    public void create(Account account);

    public void update(Account account);

    public Optional<Account> findOne(long id);

    public Optional<Account> findByEmail(String email);
}
