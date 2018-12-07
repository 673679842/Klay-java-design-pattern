package com.klay.abstractfactory;

public class LeBlanc implements AbstractFactory{
    @Override
    public SkillQ createQ() {
        return new LeBlancQ();
    }

    @Override
    public SkillR createR() {
        return new LeBlancR();
    }
}
