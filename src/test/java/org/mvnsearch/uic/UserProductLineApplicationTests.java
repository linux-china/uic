package org.mvnsearch.uic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserProductLineApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class UserProductLineApplicationTests {

    @Autowired
    private Environment env;

    @Test
    public void contextLoads() {
        System.out.println(env.getProperty("spring.application.group"));
    }

}
