package com.klay.bridge;

public class LeBlanc extends Hero {
    private SkillQ q;

    LeBlanc(SkillQ q){
        this.q = q;
    }

    @Override
    public void play() {
        q.play();
    }

    @Override
    public void name() {
        System.out.println("my name is LeBlanc");
    }
}
