package com.klay.intrinsic;

public class SkillQ extends Skill{
    private String name;
    public SkillQ(String name){
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("I'm using " + name);
    }
}
