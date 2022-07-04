class PrácticaFinalTema1 {
    public static void main(String [] args) {
	    int x = 1;
		System.out.println("-------------------------");
		System.out.println("Primeros 25 enteros:");
		
		while ( x < 25 ) {
		    
			
			System.out.print(x);
			System.out.print(",");
			x = x + 1;
		}
          if (x == 25) {
            System.out.println(x);
         }
		System.out.println("-------------------------");
		 
		System.out.println("Los primeros pares hasta el 50:");
		x = 2;
		 
		 
		while ( x < 50 ) {
			System.out.print(x);
		    System.out.print(",");
			 x = x + 2;
	    }
	    
		  if (x == 50) {
            System.out.println(x);
		  }
		System.out.println("-------------------------");
		System.out.println("Los primeros impares hasta el 49:");
        x = 1; 		

        while ( x < 49 ) {
		    
			
			System.out.print(x);
			System.out.print(",");
			x = x + 2;
        }
        
          if (x == 49) {
            System.out.println(x);
         }	

        System.out.println("-------------------------");
		System.out.println("TABLAS DE MULTIPLICAR:");		 
		System.out.println("-------------------------");
		
        int y = 1;		
        x = 1;
		int z = 1;
		
        while ( x < 11 ) {
			
			
			System.out.print("Tabla de multiplicar del ");
			System.out.print(x);
			System.out.println(":");
		    y = 1; 
            			
			while ( y < 11 ) {
			  z = x*y;
			  System.out.print(x);
			  System.out.print("*");
		      System.out.print(y);
			  System.out.print("=");
			  System.out.println(z);
			  y = y + 1;
			}
            System.out.println("---------");
			x = x + 1;
            
		}

        x = x + 1;
    }
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






















