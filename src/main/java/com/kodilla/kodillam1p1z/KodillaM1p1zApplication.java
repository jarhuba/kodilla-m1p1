package com.kodilla.kodillam1p1z;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaM1p1zApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaM1p1zApplication.class, args);

        User adam = new User("Adam", 40.5, 178);
        System.out.println(adam.checkIsOverThirtyAndOver160());
    }
}

class User {
    String name;
    double age;
    double height;

    User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean checkIsAgeOverThirty() {
        if (this.age > 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIsHeightOver160() {
        if (this.height > 160) {
            return true;
        } else {
            return false;
        }
    }

    public String checkIsOverThirtyAndOver160() {
        if (this.name != null) {
            if (checkIsAgeOverThirty() && checkIsHeightOver160()) {
                return "User is older than 30 and higher then 160cm";
            } else {
                return "User is younger than 30 or lower than 160cm";
            }
        } else {
            return "The data is incorrect. Dane są niepoprawne";
        }
    }
}
