package org.mvnsearch.uic.domain.specification;

import java.util.Optional;

/**
 * account specification
 *
 * @author linux_china
 */
public interface AccountSpec {

    public Optional<Long> isEmailUnique(String email);

    public Optional<Long> isNickUnique(String nick);

    /**
     * 判断id
     * @param id
     * @return
     */
    public boolean isIdLegal(String id);
}
