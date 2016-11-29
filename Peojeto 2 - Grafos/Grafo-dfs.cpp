/
#include <iostream>
#include <list>
#include <algorithm>
#include <stack> 

using namespace std;

class Grafo{
	int v; 
	list<int>*adj;
	
	public:
		Grafo(int v);
		void adicionarAresta(int v1, int v2);
		void dfs(int v);
};


Grafo::Grafo(int v){
	this ->v = v;//atrivui o numero de vertices
	adj = new list<int>[v];//cria as listas
	
}

void Grafo::adicionarAresta(int v1,int v2){
	adj[v1].push_back(v2);
}

void Grafo::dfs(int v){
	stack<int>pilha;
	bool visitados[v];
	for(int i = 0; i < v; i++){
		visitados[i] = false;
	}
	while(true){
		if(!visitados[v]){
			cout<<"visitando vertice "<<v<<"..."<<endl;
			visitados[v] = true;
			pilha.push(v);
		}
		bool achou = false;
		list<int>::iterator it;
		for(it = adj[v].begin(); it != adj[v].end() ; it++)
		{
			if(!visitados[*it]){
				achou = true;
				break;
			}
		}
		if(achou){
			v = *it; 
		}
		else{
			pilha.pop();
			if(pilha.empty()){
				break;
			}
			v = pilha.top();
			
		}
	}
}


int main(int argc, char** argv)
{
	int v = 8;
	
	Grafo grafo(v);
	grafo.adicionarAresta(0,1);
	grafo.adicionarAresta(0,2);
	grafo.adicionarAresta(1,3);
	grafo.adicionarAresta(1,4);
	grafo.adicionarAresta(2,5);
	grafo.adicionarAresta(2,6);
	grafo.adicionarAresta(6,7);
	
	grafo.dfs(0);
}