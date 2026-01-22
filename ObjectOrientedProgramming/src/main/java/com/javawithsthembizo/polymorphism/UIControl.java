package com.javawithsthembizo.polymorphism;

public abstract class UIControl {

    private boolean isEnabled = true;

    public UIControl() {
        System.out.println("UIControl constructor");
    }// this constructor still gets called

    public abstract void render(); // will force subclasses to implement this method

    public void enable(){
        isEnabled=true;
    }

    public void disable(){
        isEnabled=false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }

}
