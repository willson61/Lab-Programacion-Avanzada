/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 *
 * @author t203
 */
public class Laboratorio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedPositionaList<String> miLista = new LinkedPositionaList<>();
        Position<String> p0, p1, p2, p3, p4, p5, p6;
        p0 = miLista.addFirst("g");
        p1 = miLista.addAfter(p0, "f");
        p2 = miLista.addAfter(p1, "b");
        p2 = miLista.addAfter(p2, "c");
        p2 = miLista.addAfter(p2, "d");
        p3 = p2;
        p4 = miLista.addAfter(p3, "e");
        System.out.println("Valores de punteros");
        System.out.println("p1 = " + p1.getElement());
        System.out.println("p2 = " + p2.getElement());
        System.out.println("p3 = " + p3.getElement());
        System.out.println("Valores de la Lista");
        String salida = miLista.removeFirst();
        while(salida != null){
            System.out.println(salida);
            salida = miLista.removeFirst();
        }
    }
    
}
