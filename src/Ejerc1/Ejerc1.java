package Ejerc1;

public class Ejerc1 {

	
	static void CargarArray(int A[]) {
        int i;
        for (i = 0; i < A.length; i++)
            A[i]= (int) (Math.random()*9+1);
    }
	
	static void ShowArray(int A[]) {
        int i;
        for (i = 0; i < A.length; i++)
           System.out.print(A[i] +" ");
        System.out.println();

    }
	
	static void OrdenarArray(int A[]) {
		int tmp=0;
		for (int x = 0; x < A.length; x++) {
	        for (int i = 0; i < A.length-1; i++) {
	            if(A[i] < A[i+1]){
	                tmp = A[i+1];
	                A[i+1] = A[i];
	                A[i]=tmp;
	            }
	        }
	    }
	    }
	    
    
	public static void main(String[] args) {     
	    
	    int A[]= new int[9];
	    int i=0;
	    int menor;
	    //Cargar el array aleatoriamente de valores numéricos
        CargarArray(A);
	    //Mostrar el array
        ShowArray(A);
	   //Ordenar el array de mayor a menor
        OrdenarArray(A);
        //Mostrar el Array
        ShowArray(A);
	//Volver a mostrar el array ordenado

	}

}