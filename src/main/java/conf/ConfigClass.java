package conf;

import model.Animal;
import model.Cat;
import model.LifeForm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    Cat getCat() {
        return new Cat();
    }

    @Bean
    Animal getAnimal() {
        Animal animal = new Animal();
        animal.setCat(getCat());
        return animal;
    }

    @Bean
    LifeForm getLifeForm() {
        LifeForm lifeform = new LifeForm();
        lifeform.setAnimal(getAnimal());
        return lifeform;
    }
}