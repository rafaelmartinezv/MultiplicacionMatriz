// Cambio realizado a Viernes3
package matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Matriz {

   
    public static void main(String[] args) throws IOException {
        //Random Numero = new Random();
	      BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));
              int Numero = 0;
	        System.out.println("ingrese numero de filas de la primera matriz");
	       int Fil1 = Integer.parseInt(Entrada.readLine());
	        System.out.println("ingrese numero de columnas de la primera matriz");
	       int Col1 = Integer.parseInt(Entrada.readLine());
	        System.out.println("ingrese numero de filas de la segunda matriz");
	       int Fil2 = Integer.parseInt(Entrada.readLine());
	        System.out.println("ingrese numero de columnas de la segunda matriz");
	       int Col2 = Integer.parseInt(Entrada.readLine());
               
	       int[][] Matriz1 = new int[Fil1][Col1];
	       int[][] Matriz2 = new int[Fil2][Col2];
	       int[][] MatrizR = new int[Fil1][Col2];
	        System.out.println("La Matriz 1");
 
 
	        for(int i=0;i<Fil1;i++){
	            System.out.print("[ ");
	            for(int j=0;j<Col1;j++){
	                Matriz1[i][j] = Numero;
	                System.out.print(Matriz1[i][j]+" ");
                        Numero++;
	            }
	            System.out.print("]");
	            System.out.println("");
	        }
	        System.out.println("La Matriz 2");
	        for(int i=0;i<Fil2;i++){
	            System.out.print("[ ");
	            for(int j=0;j<Col2;j++){
	                Matriz2[i][j]=Numero;
	                System.out.print(Matriz2[i][j]+" ");
                        Numero++;
	            }
	            System.out.print("]");
	            System.out.println("");
	        }
 
	        if(Col1 == Fil2){
	            System.out.println("La matriz resultante es: ");
 
	            for(int i=0;i<Fil1;i++){
 
	            	System.out.print("[ ");
 
	            for(int j=0;j<Col2;j++){
 
 
	            for(int h=0;h<Col1;h++){
 
	            	 MatrizR[i][j] += Matriz1[i][h] * Matriz2[h][j];
                }
                System.out.print(MatrizR[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
    else{
        System.out.println("Los rangos de las matrices son incorrectos");
        }
    }
}
    

