package com.klay.intrinsic;

public class Akali {
    private Skill skillQ;
    private String skillQName;
    private Skill skillR;
    private String skillRName;
    private Skill skillD;
    private String skillDName;

    public void setSkillD(Skill skillD) {
        this.skillD = skillD;
    }

    public Skill getSkillD() {
        return skillD;
    }

    public Skill getSkillQ() {
        return skillQ;
    }

    public Skill getSkillR() {
        return skillR;
    }

    public void setSkillQ(Skill skillQ) {
        this.skillQ = skillQ;
    }

    public void setSkillR(Skill skillR) {
        this.skillR = skillR;
    }

    public String getSkillDName() {
        return skillDName;
    }

    public String getSkillQName() {
        return skillQName;
    }

    public void setSkillDName(String skillDName) {
        this.skillDName = skillDName;
    }

    public void setSkillQName(String skillQName) {
        this.skillQName = skillQName;
    }

    public String getSkillRName() {
        return skillRName;
    }

    public void setSkillRName(String skillRName) {
        this.skillRName = skillRName;
    }
}
