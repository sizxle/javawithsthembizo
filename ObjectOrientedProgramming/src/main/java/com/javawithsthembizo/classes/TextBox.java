package com.javawithsthembizo.classes;

public class TextBox {

    public String text="";//Reference Types gets initialized to null if no initial value is supplied

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        this.text="";
    }
}
