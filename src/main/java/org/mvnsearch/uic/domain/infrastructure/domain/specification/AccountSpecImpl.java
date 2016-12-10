package org.mvnsearch.uic.domain.infrastructure.domain.specification;


import org.mvnsearch.uic.domain.specification.AccountSpec;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * account sepecification implementation
 *
 * @author linux_china
 */
@Component
public class AccountSpecImpl implements AccountSpec {

    public Optional<Long> isEmailUnique(String email) {
        return null;
    }

    @Override
    public Optional<Long> isNickUnique(String nick) {
        return null;
    }

    @Override
    public boolean isIdLegal(String id) {
        return false;
    }
}
