package com.klay.decorator;

public class Decorator extends Hero {
    private Hero hero;

    public Decorator(Hero hero){
        this.hero = hero;
    }

    @Override
    public void operate() {
        hero.operate();
    }
}
