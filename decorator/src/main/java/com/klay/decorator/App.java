package com.klay.decorator;

public class App {
    public static void main(String[] args){
        Hero akali = new Akali();
        akali.operate();
        System.out.println("----------------------");
        Hero akaliWithAttack = new DecoratorAttack(akali);
        akaliWithAttack.operate();
        System.out.println("----------------------");
        Hero akaliWithAttackAndQ = new DecoratorSkillQ(akali);
        akaliWithAttackAndQ.operate();
    }
}
