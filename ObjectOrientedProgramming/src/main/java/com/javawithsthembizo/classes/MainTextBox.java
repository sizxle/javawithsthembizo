package com.javawithsthembizo.classes;

public class MainTextBox {

    public static void main(String ...args){

        TextBox textBox1 = new TextBox();
        textBox1.setText("Name: Sthembizo");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2= new TextBox();// must cleaner - java detects the type of txtBox2
        textBox2.setText("Surname: Molefi");
        System.out.println(textBox2.text);
    }
}
