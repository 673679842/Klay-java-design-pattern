package com.klay.adapter.objects;

public class SkillDAdapter implements SkillNormal {
    SkillSpecial skillSpecial;
    SkillDAdapter(SkillSpecial skillSpecial){
        this.skillSpecial = skillSpecial;
    }
    public void play() {
        skillSpecial.playSpecial();
    }
}
