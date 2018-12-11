package com.klay.bridge;

public class Akali implements Hero {

    private SkillQ q;

    Akali(SkillQ q){
        this.q = q;
    }

    @Override
    public void play() {
        q.play();
    }

    @Override
    public void name() {
        System.out.println("my name is Akali");
    }


}
