import java.util.Scanner;

public class MatrizIdentidad {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
        int x = 1;
        
        while(x != 0) {
        	System.out.println("Introduzca un número, que será el de filas y columnas de la matriz que al ser cuadrada es el mismo: ");
        	x = datos.nextInt();
        	
        	if(x>0 && x<=50) {
        		
        		int matriz[][] = new int[x][x];
                
                for (int i = 0; i < matriz.length; i++) {
        			
                	for (int j = 0; j < matriz.length; j++) {
        				
                		if(i==j) {
                			matriz[i][j]=1;
        					
        				}
                		else {
                			matriz[i][j]=0;
                		}
        				System.out.print(matriz[i][j]);
        				System.out.print(" ");


        			}
        			System.out.println("");
        		}

        	}
        	
        }
        
		System.out.println("Fin");

        
	}

}
