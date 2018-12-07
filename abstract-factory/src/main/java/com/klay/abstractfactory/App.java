package com.klay.abstractfactory;

public class App {
    public AbstractFactory createFactory(String hero){
        switch (hero){
            case "Akali":
                return new Akali();
            case "LeBlanc":
                return new LeBlanc();
            default:
                throw new IllegalArgumentException("not supported.");
        }

    }
    public static void main(String[] args){
        App app = new App();
        AbstractFactory factory = app.createFactory("Akali");
        factory.createQ().use();
        factory.createR().use();
        factory = app.createFactory("LeBlanc");
        factory.createQ().use();
        factory.createR().use();
    }
}
