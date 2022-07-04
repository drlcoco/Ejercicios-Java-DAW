
public class Cajero {

	public static void main(String[] args) {
		Cuenta caj = new Cuenta();
		
		caj.bienvenida();
		
		while(caj.x==0) {

			caj.operacion();//Pedirá al usuario qué operación quiere realizar
			if(caj.getNumeroOperacion()==2) {
				caj.ingresar();//Modifica el saldo de la cuenta y muesta un mensaje de la operación realizada.
			}
			if(caj.getNumeroOperacion()==3) {
				caj.extraer();//Modifica el saldo de la cuenta y muestra un mensaje.
			}
			if(caj.getNumeroOperacion()==1) {
				caj.obtenerSaldo();//Muestra el saldo actual de la cuenta.
			}
			caj.x=0;
			
			if(caj.getNumeroOperacion()==4) {
				caj.salir();// Finaliza el programa.
			}
		}
			
		caj.fin();
		
		
	}

}
