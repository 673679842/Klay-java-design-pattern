package com.klay.builder;

import com.klay.builder.Akali;

public abstract class Builder {
    protected Akali akali = new Akali();
    public abstract void buildDamage(String damage);
    public abstract void buildAbility_power(String ability_power);
    public abstract void buildArmor(String armor);
    public abstract void buildSpell_resistance(String spell_resistance);
    public abstract void buildSpeed(String speed);
    public abstract Akali getAkali();
}
