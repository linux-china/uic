package org.mvnsearch.uic.domain.infrastructure.domain.factory;

import org.mvnsearch.uic.domain.factory.AccountFactory;
import org.mvnsearch.uic.domain.model.Account;
import org.springframework.stereotype.Component;

/**
 * account factory implementation
 *
 * @author linux_china
 */
@Component
public class AccountFactoryImpl implements AccountFactory {
    public Account createFromWechat(String wechatXml) {
        return null;
    }
}
