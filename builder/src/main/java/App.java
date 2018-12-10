public class App {
    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Akali akali = director.construct();
        System.out.println("我的攻击：" + akali.getDamage() +
                            "我的法强：" + akali.getAbility_power() +
                            "我的护甲：" + akali.getArmor() +
                            "我的魔抗：" + akali.getSpell_resistance() +
                            "我的移速：" + akali.getSpeed());
    }
}
