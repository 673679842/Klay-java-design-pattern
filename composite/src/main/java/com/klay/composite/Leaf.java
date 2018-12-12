package com.klay.composite;

public class Leaf extends Component{
    private String name;

    Leaf(String name){
        this.name = name;
    }

    @Override
    public void add(Component component) {
        System.out.println("error");
    }

    @Override
    public void remove(Component component) {
        System.out.println("error");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("error");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("you are operate leaf" + this.name);
    }
}
