package org.mvnsearch.uic.domain.model;

import org.mvnsearch.ddd.domain.annotations.DomainEntity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linux_china
 */
@DomainEntity
public class PaymentProfile {
    private Long id;
    private Integer accountId;
    private String bankName;
    private String bankAccount;
    private Date createdAt;

}
