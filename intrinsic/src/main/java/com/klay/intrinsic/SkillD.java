package com.klay.intrinsic;

public class SkillD extends Skill {
    private String name;
    public SkillD(String name){
//        super(name);
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("I'm using " + name);
    }
}
