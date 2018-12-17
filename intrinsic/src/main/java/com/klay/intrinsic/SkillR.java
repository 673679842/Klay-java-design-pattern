package com.klay.intrinsic;

public class SkillR extends Skill {
    private String name;
    public SkillR(String name){
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("I'm using " + name);
    }
}
