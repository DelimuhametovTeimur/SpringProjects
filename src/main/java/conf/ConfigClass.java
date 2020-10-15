package conf;

import model.Animal;
import model.Cat;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("cat")
    Animal getAnimal() {
        return new Animal(getCat());
    }

    @Bean
    @Qualifier("dog")
    Animal getAnimal2() {
        return new Animal(getCat());
    }
}