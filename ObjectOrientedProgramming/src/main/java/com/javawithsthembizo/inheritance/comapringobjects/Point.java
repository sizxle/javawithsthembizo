package com.javawithsthembizo.inheritance.comapringobjects;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;// self- check
        if(obj==null) return false;//null check
        if(!(obj instanceof Point )) return false;//typecheck
        var other= (Point)obj;
        return other.x == x && other.y==y;

    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}