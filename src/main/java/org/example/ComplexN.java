package org.example;

public class ComplexN {
    private double x, y;

    ComplexN(double x, double y){
        this.x=x;
        this.y=y;
    }
    ComplexN(){
        x=5;
        y=3;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
