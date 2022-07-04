import java.util.Random;

import javax.swing.JOptionPane;

public class Fabrica {

	public static void main(String[] args) {
		
		Coche car = new Coche();
		
		car.bienvenida();

		Coche[] fa = new Coche[5];
		
		
		
		
		do {
            
			
            switch(car.opcion) {
            
                case 0://MENÚ
                	car.menu();
                	break;
                	
                case 1://Fabricar coche matrícula.
                	if (car.getNumCoches() <= car.getMAX_COCHES()) {
                		for (int i = 0; i < car.getNumCoches(); i++) {
                			fa[0] = new Coche("4322-JDS");
                    		fa[0].mostrarDatos();
                    		fa[0].mostrarNumCoches();
                    		
						}
                	}                	
            		car.opcion = 0;
                	break;
                	
                case 2://Fabricar coche npuertas, nplazas.
            		if (car.getNumCoches() <= car.getMAX_COCHES()) {
                		for (int i = 0; i < car.getNumCoches(); i++) {
                    		fa[1] = new Coche(5, 3);
                    		matAleatoria();
                    		fa[1].mostrarDatos();
                    		fa[1].mostrarNumCoches();
                    		
						}
                	}       	
            		car.opcion = 0;
                	break;
                	
                case 3://Fabricar coche marca, modelo y color.
                	if (car.getNumCoches() <= car.getMAX_COCHES()) {
                		for (int i = 0; i < car.getNumCoches(); i++) {
                    		fa[2] = new Coche("bmw", "m4", "rosa");
                    		matAleatoria();
                    		fa[2].mostrarDatos();
                    		fa[2].mostrarNumCoches();

						}
                		
                	}
                	car.opcion = 0;
                    break;
                    
                case 4://Fabricar coche sin datos.
                	if (car.getNumCoches() <= car.getMAX_COCHES()) {
                		for (int i = 0; i < car.getNumCoches(); i++) {
                    		fa[3] = new Coche();
                    		fa[3].cocheSinDatos();
                    		matAleatoria();
                    		fa[3].mostrarDatos();
                    		fa[3].mostrarNumCoches();
						}
                	}  
                	car.opcion = 0;
                    break;
                    
                case 5://Tunear coche pintandolo de un color.
            		buscaCoche(Coche.getMatricula(), fa);
                	car.tunear(car.getColor());
                	car.opcion = 0;
                    break;
                    
                case 6://Tunear coche sin pintarlo.
                		buscaCoche(Coche.getMatricula(), fa);
                		car.tunear();                	
                	car.opcion = 0;
                    break;
                    
                case 7://Avanzar kilómetros.
            		buscaCoche(Coche.getMatricula(), fa);
                	car.avanzar(car.getKilometros(), fa);
                	car.opcion = 0;
                    break;
                    
                case 8://Mostrar características de un coche.
                	for (int i = 0; i < car.getNumCoches(); i++) {
                    	if (Coche.getMatricula() == fa[i].getMatricula()) {
                    		fa[i].mostrarDatos();
                    	}
                    	else {
                    		JOptionPane.showMessageDialog(null, "NO HEMOS ENCONTRADO NINGÚN COCHE CON ESA MATRÍCULA");
                    	}
					} 
                	car.opcion = 0;
                	break;
                	
                case 9://Salir del programa.
                	car.opcion = 10;
                	break;
            }
        } while(car.opcion != 10);
		
		car.fin();
    }

		
	public static String matAleatoria() {
		String matriculaAleat = "";
	    int a;
	    for (int i = 0; i < 7; i++) {
	        if (i < 5) {    // 0,1,2,3,4 posiciones de numeros
	            matriculaAleat = (int) (Math.random() * 9) + "" + matriculaAleat;

	        } else {       // 4,5,6 posiciones de letras
	            do {
	                a = (int) (Math.random() * 26 + 65);///
	            } while (a == 65 || a == 69 || a == 73 || a == 79 || a == 85);

	            char letra = (char) a;
	            if (i == 5) {
	                matriculaAleat = matriculaAleat + "-" + letra;
	            } else {
	                matriculaAleat = matriculaAleat + "" + letra;
	            }

	        }
	    }
 	    return matriculaAleat;

	}
	
	
	public static String buscaCoche (String matricula, Coche[] fa) {
		boolean encontrada = false;
		String comparaMatricula = "";
		int posicion = -1;
		comparaMatricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA DEL COCHE: ");
		for (int i = 0; i < fa.length; i++) {
			if (comparaMatricula == fa[i].getMatricula()) {
				//i = Integer.parseInt(posicion);
				//posicion.charAt(i);
				encontrada = true;
				posicion = i;
				JOptionPane.showMessageDialog(null, "SU COCHE SE ENCUENTRA EN LA POSICIÓN: "+posicion);

			}
			else {
				JOptionPane.showMessageDialog(null, "NO HEMOS ENCONTRADO NINGÚN COCHE CON ESA MATRÍCULA");
			}
		}
		return "HEMOS ENCONTRADO SU COCHE "+comparaMatricula+" EN LA POSICIÓN "+posicion+ encontrada;

	}
	

		//System.out.println("\n - COCHE "+(i+1)+":\n - MATRÍCULA: "+ Coche.getMatricula()+"\n - MARCA: "+Coche.getMarca()+"\n - MODELO: "+ Coche.getModelo()+"\n - COLOR: "+ Coche.getColor()+"\n - TECHO SOLAR: "+Coche.techoSolar()+"\n - KILÓMETROS: "+Coche.getKilometros()+"\n - PUERTAS: "+Coche.getNumPuertas()+"\n - PLAZAS: "+Coche.getNumPlazas()+"\n");

		//Muestra toda la informacion del coche.
	   
	
	
	
}
