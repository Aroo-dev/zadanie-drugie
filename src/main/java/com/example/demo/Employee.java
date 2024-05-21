package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements IEmployee {

   private Person person;
   private YearOfEmployment yearOfEmployment;

   @Autowired
   public Employee(Person person, YearOfEmployment yearOfEmployment) {
      this.person = person;
      this.yearOfEmployment = yearOfEmployment;
   }

   @Override
   public void showEmployeeInfo() {
      System.out.println("My name is " + person.getName() + ", I am " + person.getAge() + " years old, and I have been employed since " + yearOfEmployment.getYear() + ".");
   }
}
