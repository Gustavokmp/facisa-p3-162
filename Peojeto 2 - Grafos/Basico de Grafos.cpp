//Grafos - Lista de Adjacência
#include <iostream>
#include <list>
#include <algorithm>//Função find

using namespace std;

class Grafo{
	int v;
	list<int>*adj;
	
	public:
		Grafo(int v);//contrutor
		void adicionarAresta(int v1, int v2);//adiciona uma aresta no grafo
};


Grafo::Grafo(int v){
	this ->v = v;//atrivui o numero de vertices
	adj = new list<int>[v];//cria as listas
	
}

void Grafo::adicionarAresta(int v1,int v2){
	adj[v1].push_back(v2);
}

int main(int argc, char** argv)
{
	//Criando grafo de 4 vertices
	Grafo grafo(4);
	
	//adicionando as arestas;
	grafo.adicionarAresta(0,1);
	grafo.adicionarAresta(0,3);
	grafo.adicionarAresta(1,2);
	grafo.adicionarAresta(3,1);
	grafo.adicionarAresta(3,2);
	//testes de grau de saida
	cout<<"Grau de saida do vertice 0: "<<grafo.obterGrauDeSaida(0)<<endl;
	cout<<"Grau de saida do vertice 1: "<<grafo.obterGrauDeSaida(1)<<endl;
	cout<<"Grau de saida do vertice 2: "<<grafo.obterGrauDeSaida(2)<<endl;
	cout<<"Grau de saida do vertice 3: "<<grafo.obterGrauDeSaida(3)<<endl;
	
	//testes existe vizinho
	if(grafo.existeVizinho(0,1)) cout<<" 0 e 1 sao vizinho"<<endl;
	else cout<<"0 e 1 NAO sao vizinhos";
	
		if(grafo.existeVizinho(0,2)) cout<<" 0 e 2 sao vizinho"<<endl;
	else cout<<"0 e 2 NAO sao vizinhos";
	return 0;
}