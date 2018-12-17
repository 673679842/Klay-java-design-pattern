package com.klay.intrinsic;

public class App {
    public static void main(String[] args){
        Akali akali = new Akali();
        SkillFactory factory = new SkillFactory();
        akali.setSkillD(factory.getSkill("D"));
        akali.setSkillDName("点燃");
        akali.setSkillQ(factory.getSkill("Q"));
        akali.setSkillQName("奥义！绯叶");
        akali.setSkillR(factory.getSkill("R"));
        akali.setSkillRName("秘奥义！幻樱杀缭乱");
        akali.getSkillD().use();
        System.out.println(akali.getSkillDName());
        akali.getSkillQ().use();
        System.out.println(akali.getSkillQName());
        akali.getSkillR().use();
        System.out.println(akali.getSkillRName());
    }
}
