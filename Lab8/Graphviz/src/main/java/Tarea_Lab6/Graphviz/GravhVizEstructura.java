package Tarea_Lab6.Graphviz;
/**
 * @author Will
 */
import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;

public class GravhVizEstructura {
	/**
	 * 
	 * @param ruta Direccion del archivo que posee la informacion del grafo
	 * @throws IOException
	 */
	public void createGraphFromTxt(String ruta) throws IOException{
		String[] labels;
		int cantLabels = 0;
		FileReader fr = null;
		FileReader fr2 = null;
	    BufferedReader br = null;
	    BufferedReader br2 = null;
		File file = new File(ruta);
		fr = new FileReader(file);
		fr2 = new FileReader(file);
		br = new BufferedReader(fr);
		br2 = new BufferedReader(fr2);
		String linea;
		String linea2;
		int cont = 0;
		while((linea = br.readLine()) != null) {
			cantLabels++;
		}
		labels = new String[cantLabels];
		while((linea2 = br2.readLine()) != null) {
			labels[cont] = linea2;
			cont++;
		}
		
		Graph g = graph("tareaLab7").directed().with(node(labels[0]).link(node(labels[1])).link(labels[2]));
		Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("example/tarea7.png"));
		br.close();
		br2.close();
	}
}
