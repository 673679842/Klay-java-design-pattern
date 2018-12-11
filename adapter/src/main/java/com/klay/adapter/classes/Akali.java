package com.klay.adapter.classes;

public class Akali implements IAkali{
    @Override
    public void play() {
        SkillQ skillQ = new SkillQ();
        skillQ.play();
        SkillDAdapter adapter = new SkillDAdapter();
        adapter.play();
    }
}
