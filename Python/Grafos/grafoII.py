class Grafo:
    v = 0
    lista = {}
    #constructor
    def __init__(self,v):
        self.v = v
        for i in range(self.v):
            self.lista[i] = []
    #add a 'way' from v1 to v2
    def adicionarAresta(self,v1,v2):
        self.lista[v1].append(v2)
    #get the out degree of v1
    def obterGrauDeSaida(self,v1):
        return len(self.lista[v1])
    #get the in degree of v1
    def obterGrauDeEntrada(self,v1):
        cont = 0
        for i in range(self.v):
            if(v1 in self.lista[i]):
                cont+=1
        return cont 
    #check if v2 has a way to v1
    def existeVizinho(self,v1,v2):
        if(v2 in self.lista[v1]):
            return True
        return False



#execution
grafo = Grafo(4)

grafo.adicionarAresta(0,1)
grafo.adicionarAresta(0,3)
grafo.adicionarAresta(1,2)
grafo.adicionarAresta(3,1)
grafo.adicionarAresta(3,2)

print(grafo.obterGrauDeSaida(1))
print(grafo.obterGrauDeSaida(3))

print(grafo.existeVizinho(0,1))
