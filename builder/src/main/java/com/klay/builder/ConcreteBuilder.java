package com.klay.builder;

public class ConcreteBuilder extends Builder {
    protected Akali akali = new Akali();

    @Override
    public void buildDamage(String damage) {
        akali.setDamage(damage);
    }

    @Override
    public void buildAbility_power(String ability) {
        akali.setAbility_power(ability);
    }

    @Override
    public void buildArmor(String armor) {
        akali.setArmor(armor);
    }

    @Override
    public void buildSpell_resistance(String spell_resistance) {
        akali.setSpell_resistance(spell_resistance);
    }

    @Override
    public void buildSpeed(String speed) {
        akali.setSpeed(speed);
    }

    @Override
    public Akali getAkali(){
        return akali;
    };
}
