package com.klay.bridge;

public class App {
    public static void main(String[] args){
        Hero myHero = new Akali(new VayneQ());
        myHero.name();
        myHero.play();
        Hero yourHero = new Vayne(new LeBlancQ());
        yourHero.name();
        yourHero.play();
    }
}
