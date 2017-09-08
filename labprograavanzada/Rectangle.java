package org.eclipse.che.examples;

public class Rectangle implements Shape {
    private double lenght;
    private double width;
    //Constructor
    public Rectangle(double width, double lenght){
        this.lenght=lenght;
        this.width=width;
    }
    //Calculo de Area
    public double getArea(){
        return this.width * this.lenght;
    }
    //Impresion de datos
    public String toString(){
        return "Rectangle[Width: "+this.width+", Lenght: "+this.lenght+", Area: "+this.getArea()+"]";
    }
}
