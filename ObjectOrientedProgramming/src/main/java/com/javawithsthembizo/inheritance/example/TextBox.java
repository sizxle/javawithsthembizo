package com.javawithsthembizo.inheritance.example;

public class TextBox extends UIControl {

    private String text="";

    //subclass calls the constructor of the baseclass
    // java compiler puts super()
    //only if the parent constructor takes no arguments otherwise we have to explicitly call the superclass contructor
    public TextBox() {
        System.out.println("TextBox Constructor");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        this.text="";
    }
}
