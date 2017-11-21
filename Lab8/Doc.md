Documentacion
-------------

Este laboratorio se enfoco al aprendizaje de la lectura de textos y utilizacion de 
la dependencia para java de graphviz

# Grafo
El grafico generado a partir del archivo de texto .txt de tres lineas es el siguiente:
![Graf - 1](https://github.com/willson61/Lab-Programacion-Avanzada/blob/master/Lab8/Graphviz/example/tarea7.png)

# Codigo
EL codigo utilizado para generar el grafo fue el siguiente:
<pre><code>
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
  </code></pre>
