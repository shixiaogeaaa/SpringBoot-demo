package com.repair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.repair"})
@MapperScan(basePackages = {"com.repair.dao"})
public class RepairApplication {
    public static void main(String[] args) {

        SpringApplication.run(RepairApplication.class, args);
    }

}
