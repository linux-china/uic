package org.mvnsearch.uic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * user product line application
 *
 * @author linux_china
 */
@SpringBootApplication
public class UserProductLineApplication {
    private static Logger log = LoggerFactory.getLogger(UserProductLineApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UserProductLineApplication.class, args);
        log.info("Application started");
    }
}
