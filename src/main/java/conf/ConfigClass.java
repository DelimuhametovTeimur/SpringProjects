package conf;

import model.Animal;
import model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "model")
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
}