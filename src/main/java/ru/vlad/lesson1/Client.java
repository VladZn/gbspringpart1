package ru.vlad.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final Rifle rifle = context.getBean(Rifle.class);
        final Ammo ammo = context.getBean(Ammo.class);
        rifle.setAmmo(ammo);
        rifle.doShot();
    }
}
