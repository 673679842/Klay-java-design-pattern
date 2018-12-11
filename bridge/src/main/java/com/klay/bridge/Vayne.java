package com.klay.bridge;

public class Vayne implements Hero {

    private SkillQ q;

    Vayne(SkillQ q){
        this.q = q;
    }

    @Override
    public void play() {
        q.play();
    }
    @Override
    public void name() {
        System.out.println("my name is Vayne");
    }
}