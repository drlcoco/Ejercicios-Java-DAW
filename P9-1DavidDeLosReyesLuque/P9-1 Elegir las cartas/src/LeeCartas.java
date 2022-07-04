import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeeCartas {
	
	static ArrayList<String> cartas = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException {
		
		Cartas carta = new Cartas();

		try {
			File myFile = new File("/Users/davidrl/eclipse-workspace/P9-1 Elegir las cartas/src/Cartas.txt");
			
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			
			
			String line = null;
			while((line = reader.readLine()) != null) {
				cartas.add(line);
			    String[] result = line.split("/");
			    for(String token:result) {
			    }
			}
			
			System.out.println("COMIENZA EL JUEGO DE PREGUNTAS Y RESPUESTAS. ESTÁS PREPARADO?\n");
			
			String intento = "";
			
			for (int i = 0; i < cartas.size(); i++) {
				Scanner s = new Scanner(System.in);
				System.out.println("PREGUNTA Nº "+ (i+1));
				System.out.println(carta.getPregunta()[i]);
				intento = s.nextLine();
				if(intento.equalsIgnoreCase(carta.getRespuesta()[i])) {
					System.out.println("ENHORABUENA, LA RESPUESTA ES CORRECTA, HAS GANADO 10 PUNTOS\n");
				}
				else {
					System.out.println("ERROR, LA RESPUESTA ES INCORRECTA\n");
				}
			}
			
			System.out.println("FIN DEL JUEGO, HASTA LA PRÓXIMA COLEGA");
			
			reader.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
