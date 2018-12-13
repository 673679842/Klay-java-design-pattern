package com.klay.decorator;

public class DecoratorAttack extends Decorator {
    public DecoratorAttack(Hero hero){
        super(hero);
    }

    @Override
    public void operate() {
        super.operate();
        addedBehavior();
    }

    public void addedBehavior(){
        System.out.println("I can Attack other");
    }
}
