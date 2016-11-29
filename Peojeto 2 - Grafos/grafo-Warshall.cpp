#include <iostream>
#include<stdio.h>
#define V 4
#define INF 99999
 
 
void Warshall (int grafo[][V])
{
    int matriz[V][V], i, j, k;
 
    //Inicialize a matriz da solu��o igual � matriz do gr�fico de entrada
    for (i = 0; i < V; i++)
        for (j = 0; j < V; j++)
            matriz[i][j] = grafo[i][j];
 
    //Adicionar todos os v�rtices, um a um, para o conjunto de v�rtices intermedi�rios
    for (k = 0; k < V; k++)
    {
        for (i = 0; i < V; i++)
        {
            for (j = 0; j < V; j++)
            {
                // vefifica se o caminho � o mais curto
                // atualiza valores matriz dist[i][j]
                if (matriz[i][k] + matriz[k][j] < matriz[i][j])
                    matriz[i][j] = matriz[i][k] + matriz[k][j];
            }
        }
    }
}
 