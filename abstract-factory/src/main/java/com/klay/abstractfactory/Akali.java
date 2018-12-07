package com.klay.abstractfactory;

public class Akali implements AbstractFactory {
    @Override
    public SkillQ createQ(){
        return new AkaliQ();
    };

    @Override
    public SkillR createR() {
        return new AkaliR();
    }
}
