package com.sekorm.idubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sekorm"})
@ImportResource(value={"classpath:spring-dubbo.xml"})
public class IdubboApplication {

    private static final Logger logger = LoggerFactory.getLogger(IdubboApplication.class);

    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext ctx = new SpringApplicationBuilder()
                .sources(IdubboApplication.class).web(WebApplicationType.NONE).run(args);

        logger.info("项目启动!");

        CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
        closeLatch.await();
    }
}
