package ru.vlad.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rifle")
public class HuntingRifle implements Rifle {

    @Autowired
    @Qualifier("ammo")
    private Ammo ammo;

    public Ammo getAmmo() {
        return ammo;
    }

    public void setAmmo(Ammo ammo) {
        System.out.println("Ружье заряжено");
        this.ammo = ammo;
    }

    public void doShot() {
        System.out.println("Сделан выстрел");
        ammo.processing();
    }
}
