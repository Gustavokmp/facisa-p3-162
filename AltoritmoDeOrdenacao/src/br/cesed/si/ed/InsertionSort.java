package br.cesed.si.ed;

public class InsertionSort {
	
	public int[] insetionSort(int[] array){
		int tamanho = array.length,aux;
		 for(int j=1; j<tamanho; j++) {
			   	aux = array[j];
			   	int i = j-1;
			   	while(i >= 0 && array[i] > aux){
			           	array[i+1] = array[i];
			           	i--;
			   	}
			    	array[i+1] = aux;
			 	}
		 return array;
	}
	
	public int[] insetionSortDecrecente(int[] array){
	      int aux, tamanho = array.length;
	      for (int i = 1; i < tamanho; i++) {
	            int j = i;
	            while (j > 0 && array[j - 1] < array[j]) {
	                  aux = array[j];
	                  array[j] = array[j - 1];
	                  array[j - 1] = aux;
	                  j--;
	            }
	      }
	      return array;
	}

}
