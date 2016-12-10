DROP TABLE IF EXISTS accounts;
-- account table
CREATE TABLE accounts (
  id         INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nick       VARCHAR(32),
  email      VARCHAR(128),
  passwd     VARCHAR(64),
  created_at DATETIME,
  updated_at DATETIME
) DEFAULT CHARSET utf8;

insert into accounts(nick,email,passwd,created_at,updated_at) VALUEs('linux_china','linux_china@hotmail.com','123456',now(),now());