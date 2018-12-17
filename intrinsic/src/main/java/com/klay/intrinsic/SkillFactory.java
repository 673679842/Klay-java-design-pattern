package com.klay.intrinsic;

import java.util.HashMap;

public class SkillFactory {
    private HashMap<String,Skill> map = new HashMap<>();
    public Skill getSkill(String key){
        if(map.containsKey(key)){
            return map.get(key);
        }
        else {
            try{

                Skill skill = (Skill) Class.forName("com.klay.intrinsic.Skill"+key).getConstructor().newInstance();
                map.put(key,skill);
                return skill;
            }catch (Exception e){
                System.out.println(e);
                return null;
            }
        }
    }
}
