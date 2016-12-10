package org.mvnsearch.uic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * user product line application
 *
 * @author linux_china
 */
@SpringBootApplication
@Slf4j
public class UserProductLineApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProductLineApplication.class, args);
        log.info("Application started");
    }
}
