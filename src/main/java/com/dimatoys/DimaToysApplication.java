package com.dimatoys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Значит так - тебе нужно сделать список любимых игрушек Димоса (10 шт)
 * с CRUD операциями, проект Spring MVC, вьюха Thymeleaf, база MSSQL или
 * Монга. Срок - завтра вечер (25.12.2022)
 */

@SpringBootApplication
public class DimaToysApplication {

    public static void main(String[] args) {
        SpringApplication.run(DimaToysApplication.class, args);
    }

}
