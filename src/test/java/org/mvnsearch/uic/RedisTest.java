package org.mvnsearch.uic;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis template test
 *
 * @author linux_china
 */
public class RedisTest extends ProjectBaseTestCase {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testPutAndGet() throws Exception {
        String key = "nick";
        redisTemplate.boundValueOps(key).set("leijuan");
        System.out.println(redisTemplate.boundValueOps(key).get());
    }
}
