package com.klay.intrinsic;

public class App {
    public static void main(String[] args){
        Akali akali = new Akali();
        SkillFactory factory = new SkillFactory();
        akali.setSkillD(factory.getSkill("D","点燃"));
        akali.setSkillQ(factory.getSkill("Q","奥义！绯叶"));
        akali.setSkillR(factory.getSkill("R","秘奥义！幻樱杀缭乱"));
        akali.getSkillD().use();
        akali.getSkillQ().use();
        akali.getSkillR().use();
    }
}
