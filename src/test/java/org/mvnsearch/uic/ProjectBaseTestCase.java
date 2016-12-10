package org.mvnsearch.uic;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * project base test case
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserProductLineApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public abstract class ProjectBaseTestCase {
}
