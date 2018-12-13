package com.klay.decorator;

public class DecoratorSkillQ extends Decorator {
    public DecoratorSkillQ(Hero hero){
        super(hero);
    }

    @Override
    public void operate() {
        super.operate();
        addedBehavior();
    }

    public void addedBehavior(){
        System.out.println("I can use Q");
    }
}
