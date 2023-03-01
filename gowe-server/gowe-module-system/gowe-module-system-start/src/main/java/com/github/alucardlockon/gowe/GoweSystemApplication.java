package com.github.alucardlockon.gowe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * GOWE后台启动类
 */
@Slf4j
@SpringBootApplication
public class GoweSystemApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(GoweSystemApplication.class);
        log.info("gowe system is started!");
    }

}
