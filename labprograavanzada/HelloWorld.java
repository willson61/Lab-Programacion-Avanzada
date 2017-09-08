package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Shape a1, a2, a3;
        a1= new Rectangle(10, 10);//Toma forma de rectangulo - Polimorficos
        a2= new Triangle(10, 4);//Toma forma de triangulo
        a3= new Rectangle(5, 5);
        //Impresion de datos
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
