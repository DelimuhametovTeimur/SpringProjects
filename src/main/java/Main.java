import conf.ConfigClass;
import model.LifeForm;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String [] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        LifeForm lifeFormBean = context.getBean(LifeForm.class);

        System.out.println("Cat name is: " + lifeFormBean.getAnimal().getCat().getName());
        System.out.println("Cat age is: " + lifeFormBean.getAnimal().getCat().getAge());
        System.out.println("Cat sound is: " + lifeFormBean.getAnimal().getCat().makeSound());
    }
}