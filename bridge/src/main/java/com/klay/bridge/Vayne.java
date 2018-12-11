package com.klay.bridge;

public class Vayne extends Hero {

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
