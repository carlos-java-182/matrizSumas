package matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Suma2Matrices {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int matriz1 [][], matriz2 [][], nFilas, nCols, suma [][];
		
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de filas"));
		nCols = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de columnas"));
		
		matriz1 = new int [nFilas][nCols];
		matriz2 = new int [nFilas][nCols];
		suma= new int[nFilas][nCols];
		
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCols; j++) {
				System.out.print("Matriz 1.- Ingresa un número para la posición ["+i+"] ["+j+"]");
				matriz1[i][j]=entrada.nextInt();
				
			}
		}
		
		System.out.println("\n");
		
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCols; j++) {
				System.out.print("Matriz 2.- Ingresa un número para la posición ["+i+"] ["+j+"]");
				matriz2[i][j]=entrada.nextInt();
				
			}}
		
		System.out.println("\n ");
		
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCols; j++) {
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
			
		}
		
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCols; j++) {
				System.out.println("La suma de las dos matrices es: "+suma[i][j]);
			}
		}
		
	}

}

