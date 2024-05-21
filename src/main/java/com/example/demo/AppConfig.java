package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {

   @Bean
   public Person person() {
      return new Person("Joe Doe", 30);
   }

   @Bean
   public YearOfEmployment yearOfEmployment() {
      return new YearOfEmployment(2015);
   }

   @Bean
   public IEmployee getEmployee() {
      return new Employee(person(), yearOfEmployment());
   }

   @Bean
   public String getName() {
      return "Zlomex";
   }

   @Bean
   public Company company() {
      return new Company(getEmployee(), getName());
   }
}
