package model;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name = "Tom";
    private int age = 6;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String makeSound() {
        return "Meow mrrrrrrrrrrrrr";
    }
}