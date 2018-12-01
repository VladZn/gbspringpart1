package ru.vlad.lesson1;

import org.springframework.stereotype.Component;

@Component("ammo")
public class PracticeCartridge implements Ammo {

    public void processing() {
        System.out.println("Боевой патрон");
    }

}
