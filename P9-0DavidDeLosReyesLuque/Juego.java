import java.io.*;


public class Juego implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {

		Jugador jugador1 = new Jugador();
		jugador1.setPoder(50);
		jugador1.setTipo("elfo");
		jugador1.getArmas()[0] = "arco";
		jugador1.getArmas()[1] = "espada";
		jugador1.getArmas()[2] = "polvo";
		
		Jugador jugador2 = new Jugador();
		jugador2.setPoder(200);
		jugador2.setTipo("troll");
		jugador2.getArmas()[0] = "garras";
		jugador2.getArmas()[1] = "brazos";
		jugador2.getArmas()[2] = "gigantes";
		
		Jugador jugador3 = new Jugador();
		jugador3.setPoder(120);
		jugador3.setTipo("mago");
		jugador3.getArmas()[0] = "hechizos";
		jugador3.getArmas()[1] = "invisibilidad";
		
		
		/*for (int i = 0; i < 3; i++) {
			
			System.out.println(jugador1.getArmas()[i]);
			System.out.println(jugador2.getArmas()[i]);
			System.out.println(jugador3.getArmas()[i]);
			
		}*/	
		
		System.out.println(jugador1.toString());
		System.out.println(jugador2.toString());
		System.out.println(jugador3.toString() + "\n\n");
		
		try {
			
			FileOutputStream fichero = new FileOutputStream("Fichero1Java.ser");
			ObjectOutputStream os = new ObjectOutputStream(fichero);
			os.writeObject(jugador1);
			os.writeObject(jugador2);
			os.writeObject(jugador3);
			os.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());  
		}
		
		try {
			
			FileInputStream fichero = new FileInputStream("Fichero1Java.ser");
			ObjectInputStream os = new ObjectInputStream(fichero);
			/*jugador1 = (Jugador) os.readObject();
			jugador2 = (Jugador) os.readObject();
			jugador3 = (Jugador) os.readObject();*/
			
			Jugador jug1Restore = (Jugador) os.readObject();
			Jugador jug2Restore = (Jugador) os.readObject();
			Jugador jug3Restore = (Jugador) os.readObject();
			
			System.out.println(jug1Restore.toString());
			System.out.println(jug2Restore.toString());
			System.out.println(jug3Restore.toString());
			os.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());  
		}

	}

}
