package app.model;

import app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalsCage animal = applicationContext.getBean("animalsCage", AnimalsCage.class);
        animal.whatAnimalSay();
    }
}
