package com.javawithsthembizo.polymorphism;

public class TextBox extends UIControl {

    private String text="";

    public TextBox() {
        System.out.println("TextBox Constructor");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        this.text="";
    }

    @Override
    public void render() {
        System.out.println("render textbox");
    }
}
