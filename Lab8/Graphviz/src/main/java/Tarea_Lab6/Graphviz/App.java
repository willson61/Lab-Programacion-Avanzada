package Tarea_Lab6.Graphviz;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Will
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
    	GravhVizEstructura proceso = new GravhVizEstructura();		
    	String name;
    	String ruta = "C:\\Users\\Will\\Desktop\\";
    	System.out.println( "Ingrese el nombre de la archivo con los datos del grafo sin la extension .txt");
        name = sc.nextLine();
        ruta = ruta + name + ".txt";
        try {
			proceso.createGraphFromTxt(ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
