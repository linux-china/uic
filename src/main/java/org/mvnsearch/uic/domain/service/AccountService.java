package org.mvnsearch.uic.domain.service;

import org.mvnsearch.ddd.domain.annotations.DomainService;
import org.mvnsearch.uic.domain.model.Account;

/**
 * account service
 *
 * @author linux_china
 */
@DomainService
public interface AccountService {

    public void create(Account account);

    public void updatePassword(Long accountId, String oldPassword, String newPassword);

    public void resetPassword(Long accountId);
}
