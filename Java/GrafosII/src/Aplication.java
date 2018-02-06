
public class Aplication {

	public static void main(String[] args) {
		Grafo grafo = new Grafo(4);
		
	    grafo.adicionarAresta(0,1);
	    grafo.adicionarAresta(0,3);
	    grafo.adicionarAresta(1,2);
	    grafo.adicionarAresta(3,1);
	    grafo.adicionarAresta(3,2);
	    
	    System.out.println(grafo.obterGrauDeEntrada(0));
	    
	    System.out.println(grafo.obterGrauDeSaida(3));
	    
	    System.out.println(grafo.existeVizinho(0,1));
	}

}
