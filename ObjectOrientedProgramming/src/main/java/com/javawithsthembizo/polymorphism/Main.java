package com.javawithsthembizo.polymorphism;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};

        for (UIControl control : controls) {
            control.render();// a runtime each control takes in a different form
        }

    }
}
