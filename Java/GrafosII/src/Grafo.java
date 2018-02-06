import java.util.ArrayList;
import java.util.HashMap;

public class Grafo {
	//Atributos
	private int v;
	private HashMap <Integer,ArrayList<Integer>> list;
	
	//Getters and Setters
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	
	public HashMap<Integer, ArrayList<Integer>> getList() {
		return list;
	}
	public void setList(HashMap<Integer, ArrayList<Integer>> list) {
		this.list = list;
	}
	
	//Constructor
	public Grafo(int v) { 
		this.v = v;
		this.list = new HashMap<Integer,ArrayList<Integer>>();
		for(int i = 0; i<v; i++) {
			list.put(Integer.parseInt(""+i),new ArrayList<Integer>());
		}
	}
	
	//Methods
	//Add a conexion between two nodes/points
	public void adicionarAresta(int v1, int v2)
	{
		list.get(v1).add(v2);
	}
	
	//Returns the out degree of a node [the number of ways that come out of the node]
	public int obterGrauDeSaida(int v1)
	{
		return list.get(v1).size();
	}
	
	//Returns the in degree of a node [the number of ways that come to the node]
	public int obterGrauDeEntrada(int v1)
	{
		int cont = 0;
		for(int i = 0; i < v; i++)
		{
			if(list.get(i).contains(v1))
				cont++;
		}
		return cont;
	}
	
	//Return true if v1 has a direct way to v2
	public Boolean existeVizinho(int v1, int v2)
	{
		if(list.get(v1).contains(v2))
			return true;
		return false;
	}
}
