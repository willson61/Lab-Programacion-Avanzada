package org.eclipse.che.examples;

public class Triangle implements Shape {
    private double base;
    private double height;
    //Constructor
    public Triangle(double height, double base){
        this.base=base;
        this.height=height;
    }
    //Calculo de Area
    public double getArea(){
        return ((this.base * this.height)/2);
    }
    //Impresion de datos
    public String toString(){
        return "Triangle[Height: "+this.height+", Base: "+this.base+", Area: "+this.getArea()+"]";
    }
}
