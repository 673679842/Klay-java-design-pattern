package com.klay.adapter.objects;

public class Akali implements IAkali {
    @Override
    public void play() {
        SkillQ skillQ = new SkillQ();
        skillQ.play();
        SkillDAdapter adapter = new SkillDAdapter(new SkillD());
        adapter.play();
    }
}
