

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class Parque {
	
	static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();


	public static void main(String[] args) {

		crearVehiculo();
		
		
		

		//for(Vehiculo e: listaVehiculos) {
			//crearVehiculo();
		//}
		
	}
	
	public static String crearVehiculo() {
		
		String usuario;

		
		usuario=JOptionPane.showInputDialog("BIENVENIDO A COCHES DE LOS REYES S.A.\nINTRODUZCA SU NOMBRE DE USUARIO.");
		
        int opcion = 0;
    	int x = 0;

        
				
		do {
			
			switch(opcion) {
            
                case 0://MENÚ
                	
    				opcion = Integer.parseInt(JOptionPane.showInputDialog("HOLA "+usuario.toUpperCase()+"\nMENÚ: PULSE LA OPCIÓN QUE DESEE REALIZAR.\n1- CREAR UN COCHE (CON O SIN DATOS).\n2- CREAR UN AUTOBÚS (CON O SIN DATOS).\n3- CREAR UNA MOTOCICLETA (CON O SIN DATOS)\n4- CREAR UNA AVIONETA (CON O SIN DATOS)\n5- CREAR UN YATE (CON O SIN DATOS)\n6- MOSTRAR CARACTERÍSTICAS DE TODOS LOS VEHÍCULOS DEL PARQUE\n7- ELIMINAR EL ÚLTIMO VEHÍCULO\n8- SALIR DEL PROGRAMA."));
                	break;
                	
                case 1://Crear un coche con o sin datos.
                	
                	if (Vehiculo.numVehiculos < Vehiculo.MAX_VEHICULOS) {
                	
                		x = Integer.parseInt(JOptionPane.showInputDialog("SI DESEA CREAR UN COCHE SIN DATOS PULSE 1 \nSI DESEA CREAR UN COCHE CON DATOS PULSE 2"));
        				
        				if(x == 1) {
    						listaVehiculos.add(new Coche());
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVO COCHE. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");

        				}
        				else if(x == 2) {
        					listaVehiculos.add(new Coche("4567-KTM", "AUDI", "A3", "BLANCO", 155.000, 3, 5, 5, true, true));
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVO COCHE. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");
        				}
        				else {
        					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR EL COCHE, EL PARQUE ESTÁ LLENO.");
        				}
                	}
                	else {
    					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR EL COCHE, EL PARQUE ESTÁ LLENO.");
    				}
                	for (int i = 0; i < listaVehiculos.size(); i++) {
                	listaVehiculos.get(i);
                		
					}
                	
                	x = 0;               	
            		opcion = 0;
                	break;
                	
                case 2://Crear un autobús con o sin datos.
                	
                	if (Vehiculo.numVehiculos < Vehiculo.MAX_VEHICULOS) {
                    	
                		x = Integer.parseInt(JOptionPane.showInputDialog("SI DESEA CREAR UN AUTOBÚS SIN DATOS PULSE 1 \nSI DESEA CREAR UN AUTOBÚS CON DATOS PULSE 2"));
        				
        				if(x == 1) {
    						listaVehiculos.add(new Autobus());
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVO AUTOBÚS. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");

        				}
        				else if(x == 2) {
        					listaVehiculos.add(new Autobus("54321-KLP", "SCANIA", "BULLER", "BLANCO", 2357, 2, 55, "CORTO", true));
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVO AUTOBÚS. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");
        				}
        				else {
        					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR EL COCHE, EL PARQUE ESTÁ LLENO.");
        				}
                	}
                	else {
    					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR EL COCHE, EL PARQUE ESTÁ LLENO.");
    				}
                	x = 0;      
            		       	
            		opcion = 0;
                	break;
                	
                case 3://Crear una motocicleta con o sin datos.
                	
                	if (Vehiculo.numVehiculos < Vehiculo.MAX_VEHICULOS) {
                    	
                		x = Integer.parseInt(JOptionPane.showInputDialog("SI DESEA CREAR UNA MOTOCICLETA SIN DATOS PULSE 1 \nSI DESEA CREAR UNA MOTOCICLETA CON DATOS PULSE 2"));
        				
        				if(x == 1) {
    						listaVehiculos.add(new Motocicleta());
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVA MOTOCICLETA. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");

        				}
        				else if(x == 2) {
        					listaVehiculos.add(new Motocicleta("45678-KJH", "YAMAHA", "YZF-R1", "ROJA", 00037, 1, 2, 1000, true));
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVA MOTOCICLETA. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");
        				}
        				else {
        					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR LA MOTOCICLETA, EL PARQUE ESTÁ LLENO.");
        				}
                	}
                	else {
    					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR LA MOTOCICLETA, EL PARQUE ESTÁ LLENO.");
    				}
                	x = 0;   
                	
                	opcion = 0;
                    break;
                    
                case 4://Crear una avioneta con o sin datos.
                	
                	if (Vehiculo.numVehiculos < Vehiculo.MAX_VEHICULOS) {
                    	
                		x = Integer.parseInt(JOptionPane.showInputDialog("SI DESEA CREAR UNA AVIONETA SIN DATOS PULSE 1 \nSI DESEA CREAR UNA AVIONETA CON DATOS PULSE 2"));
        				
        				if(x == 1) {
    						listaVehiculos.add(new Avioneta());
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVA AVIONETA. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");

        				}
        				else if(x == 2) {
        					listaVehiculos.add(new Avioneta("11765-KGP", "EUROFIGHTER", "F-18", "VERDE", 250, 2, 4, "BARAJAS", 25000));
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVA AVIONETA. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");
        				}
        				else {
        					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR LA AVIONETA, EL PARQUE ESTÁ LLENO.");
        				}
                	}
                	else {
    					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR LA AVIONETA, EL PARQUE ESTÁ LLENO.");
    				}
                	x = 0;   
                	  
                	opcion = 0;
                    break;
                    
                case 5://Crear un yate con o sin datos.
                	
                	if (Vehiculo.numVehiculos < Vehiculo.MAX_VEHICULOS) {
                    	
                		x = Integer.parseInt(JOptionPane.showInputDialog("SI DESEA CREAR UN YATE SIN DATOS PULSE 1 \nSI DESEA CREAR UN YATE CON DATOS PULSE 2"));
        				
        				if(x == 1) {
    						listaVehiculos.add(new Yate());
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVO YATE. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");

        				}
        				else if(x == 2) {
        					listaVehiculos.add(new Yate("45678-KLP", "QUICKSILVER", "PHANTOM", "BLANCO", 344, 3, 25, true, 4, 12));
    						JOptionPane.showMessageDialog(null, "HEMOS CREADO SU NUEVO YATE. EN ESTOS MOMENTOS TENEMOS UN TOTAL DE "+ Vehiculo.numVehiculos +" VEHÍCULOS EN EL PARQUE.");
        				}
        				else {
        					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR EL YATE, EL PARQUE ESTÁ LLENO.");
        				}
                	}
                	else {
    					JOptionPane.showMessageDialog(null, "NO ES POSIBLE CREAR EL YATE, EL PARQUE ESTÁ LLENO.");
    				}
                	for (int i = 0; i < listaVehiculos.size(); i++) {
                	listaVehiculos.get(i);
                		
					}
                	x = 0;  
            		
                	opcion = 0;
                    break;
                    
                case 6://Mostrar caracteristicas de todos los vehiculos del parque
                	
                	for( Vehiculo e: listaVehiculos) {
            			
            			JOptionPane.showMessageDialog(null, e.toString());
            		}
                		                	
                	opcion = 0;
                    break;
                    
                case 7://Borrar un Vehículo de la lista.
                	
                	listaVehiculos.remove(4);
        			JOptionPane.showMessageDialog(null, "EL ÚLTIMO VEHÍCULO HA SIDO ELIMINADO");
            		
                	opcion = 0;
                    break;
               
                case 8://Salir del programa.
                	opcion = 10;
                	break;
            }
		}while(opcion != 10);
            
            return "CREADO SATISFACTORIAMENTE";
    }
}
		
	
                	


