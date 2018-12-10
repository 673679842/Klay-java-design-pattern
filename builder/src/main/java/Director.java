public class Director {
    private Builder builder;
    Director(Builder builder){
        this.builder = builder;
    }
    public Akali construct(){
        builder.buildDamage("100");
        builder.buildAbility_power("0");
        builder.buildDamage("50");
        builder.buildSpell_resistance("35");
        builder.buildSpeed("350");
        Akali akali = builder.getAkali();
        return akali;
    }
}
