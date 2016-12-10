package org.mvnsearch.uic;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * jdbc template test
 *
 * @author linux_china
 */
public class JdbcTest extends ProjectBaseTestCase {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @Sql(statements = "insert into accounts(nick) values('jacky')")
    public void testQuery() throws Exception {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("SELECT id,nick FROM accounts");
        for (Map<String, Object> row : rows) {
            assertThat(row).containsKeys("nick");
        }
    }
}
