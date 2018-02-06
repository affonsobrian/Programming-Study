#include <iostream>
#include <list>
#include <algorithm> ///função find

using namespace std;

class Grafo{
    int v; ///numero de vertices
    list<int> *adj; ///ponteiro de array de lista de adjacencia
public:
    Grafo(int v); ///construtor
    void adicionarAresta(int v1, int v2); ///adiciona aresta no grafo
    int obterGrauDeSaida(int v); ///obtem o grau de saida de um vertice
    bool existeVizinho(int v1,int v2); ///verifica se v2 é vizinho de v1
};

Grafo::Grafo(int v){
    this->v = v;///atribui o numero de vertices
    adj = new list<int>[v]; ///cria as listas
}

void Grafo::adicionarAresta(int v1, int v2){
    adj[v1].push_back(v2);///Adiciona v2 a lista de vertices adjacentes de v1
}

int Grafo::obterGrauDeSaida(int v){
    return adj[v].size(); ///retorna o tamanho da lista, que é a quantidade de vizinhos
}

bool Grafo::existeVizinho(int v1, int v2){
    if(find(adj[v1].begin(),adj[v1].end(),v2) != adj[v1].end())
        return true;
    return false;
}

int main()
{
    ///Criando 4 vertices
    Grafo grafo(4);

    ///Adicionando as arestas
    grafo.adicionarAresta(0,1);
    grafo.adicionarAresta(0,3);
    grafo.adicionarAresta(1,2);
    grafo.adicionarAresta(3,1);
    grafo.adicionarAresta(3,2);

    ///Mostrando o grau de saída do vertice 1
    cout << "O grau de saida do vertice 1: " << grafo.obterGrauDeSaida(1) << endl;

    ///Mostrando o grau de saída do vertice 3
    cout << "O grau de saida do vertice 3: " << grafo.obterGrauDeSaida(3) << endl;

    ///Testa se 1 é vizinho de 0
    if(grafo.existeVizinho(0,1))
        cout << "1 eh vizinho de 0" << endl;
    else
        cout << "1 não eh vizinho de 0" << endl;
    return 0;
}
