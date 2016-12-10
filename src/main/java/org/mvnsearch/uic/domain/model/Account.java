package org.mvnsearch.uic.domain.model;

import org.mvnsearch.ddd.domain.BaseDomainEntity;
import org.mvnsearch.ddd.domain.annotations.DomainEntity;

import java.util.Date;

/**
 * account entity
 *
 * @author linux_china
 */
@DomainEntity
public class Account implements BaseDomainEntity<Long>{
    private Long id;
    private String nick;
    private String email;
    private String password;
    private Integer status;
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
