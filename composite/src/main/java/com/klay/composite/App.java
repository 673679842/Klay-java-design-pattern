package com.klay.composite;

public class App {
    public  static  void main(String[] args){
        Component root = new Composite();
        Component leaf = new Leaf("leaf");
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        root.add(composite1);
        root.add(composite2);
        root.add(leaf);
        composite1.add(leaf1);
        composite2.add(leaf2);
        root.operation();
        root.getChild(2).operation();
    }


}
