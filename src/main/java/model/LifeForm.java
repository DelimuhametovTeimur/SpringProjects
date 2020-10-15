package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LifeForm {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}