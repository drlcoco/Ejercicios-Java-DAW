import java.util.Random;

import javax.swing.JOptionPane;

public class Coche {
	
	private int numCoches;
	private final int MAX_COCHES = 5;
	public String usuario = "";
	public String techo = "";
	
	private static String matricula = "";
	private String marca = "";
	private String modelo = "";
	private String color = "";
	private boolean techoSolar = false;
	private float kilometros = 0;
	private int numPuertas = 0;
	private int numPlazas = 0;
	int opcion = 0;
	Fabrica fab = new Fabrica();
	
	
	
	public Coche(String matricula) {
		this.matricula = "4322-JDS";
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		techo = JOptionPane.showInputDialog("¿QUIERE TECHO SOLAR? INTRODUZCA SI O NO: ");
		if (techo == "SI" || techo == "si") {
			techoSolar = true;
		}
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		numCoches++;
	}
	public Coche(int numPuertas, int numPlazas) {
		this.numPuertas = 5;
		this.numPlazas = 3;
		matricula = Fabrica.matAleatoria();
		//matricula = JOptionPane.showInputDialog("INTRODUZCA LA MATRÍCULA: ");
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		techo = JOptionPane.showInputDialog("¿QUIERE TECHO SOLAR? INTRODUZCA SI O NO: ");
		if (techo == "SI" || techo == "si") {
			techoSolar = true;
		}
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numCoches++;
	}
	public Coche(String marca, String modelo, String color) {
		this.marca = "bmw";
		this.modelo = "m4";
		this.color = "rosa";
		matricula = Fabrica.matAleatoria();
		techo = JOptionPane.showInputDialog("¿QUIERE TECHO SOLAR? INTRODUZCA SI O NO: ");
		if (techo == "SI" || techo == "si") {
			techoSolar = true;
		}
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
		numCoches++;
	}
	
	public Coche() {
		matricula = Fabrica.matAleatoria();
		numCoches++;
	}	
	
	public int getMAX_COCHES() {
		return MAX_COCHES;
	}
	
	public int getNumCoches() {
		return numCoches;
	}

	public void setNumCoches(int numCoches) {
		this.numCoches = numCoches;
	}

	public static String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
			this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean techoSolar() {
		return techoSolar;
	}

	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public float getKilometros() {
		return kilometros;
	}

	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		if(numPuertas > 0) {
			this.numPuertas = numPuertas;
        }
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	
	void bienvenida() {
		usuario=JOptionPane.showInputDialog("BIENVENIDO A COCHES DE LOS REYES S.A.\nINTRODUZCA SU NOMBRE DE USUARIO.");
	}
	
	void menu() {
		try {
			if(opcion<10 && opcion>=0) {
				opcion = Integer.parseInt(JOptionPane.showInputDialog("BUENOS DÍAS "+usuario.toUpperCase()+"\nMENÚ: PULSE LA OPCIÓN QUE DESEE REALIZAR.\n1- FABRICAR COCHE (CONOCIENDO LA MATRÍCULA).\n2- FABRICAR COCHE (A PARTIR DEL Nº DE PUERTAS Y EL Nº DE PLAZAS).\n3- FABRICAR COCHE (A PARTIR DE LA MARCA, EL MODELO Y EL COLOR.\n4- FABRICAR COCHE (SIN DATOS).\n5- TUNEAR COCHE (PINTÁNDOLO DE UN COLOR).\n6- TUNEAR COCHE (SIN PINTARLO).\n7- AVANZAR KILÓMETROS.\n8- MOSTRAR CARACTERÍSTICAS DE UN COCHE.\n9- SALIR DEL PROGRAMA."));
			}
		}
		catch(Exception e) {
			if(opcion < 1 || opcion > 9) {
				JOptionPane.showMessageDialog(null, "FATAL ERROR 404! DEBE INTRODUCIR UN NÚMERO DE OPERACIÓN CORRECTO");
			}
		}
	}
	
	void cocheSinDatos() {
		matricula = Fabrica.matAleatoria();
		marca = JOptionPane.showInputDialog("INTRODUZCA LA MARCA: ");
		modelo = JOptionPane.showInputDialog("INTRODUZCA EL MODELO: ");
		color = JOptionPane.showInputDialog("INTRODUZCA EL COLOR: ");
		techo = JOptionPane.showInputDialog("¿QUIERE TECHO SOLAR? INTRODUZCA SI O NO: ");
		if (techo == "SI" || techo == "si") {
			techoSolar = true;
		}
		kilometros = Float.parseFloat(JOptionPane.showInputDialog("INTRODUZCA LOS KILÓMETROS: "));
		numPuertas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PUERTAS: "));
		numPlazas = Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL NÚMERO DE PLAZAS: "));
	}
	
	void mostrarDatos() {
		JOptionPane.showMessageDialog(null, "ESTE COCHE TIENE LOS SIGUIENTES DATOS:\nMATRÍCULA: "+matricula.toUpperCase()+"\nMARCA: "+marca.toUpperCase()+"\nMODELO: "+modelo.toUpperCase()+"\nCOLOR: "+color.toUpperCase()+"\nKILÓMETROS: "+kilometros+"\nY "+techo.toUpperCase()+" TIENE TECHO SOLAR\nTIENE "+numPuertas+" PUERTAS Y "+numPlazas+" PLAZAS.");
	}
	
	void mostrarNumCoches() {
		JOptionPane.showMessageDialog(null, "HEMOS CONSTRUIDO SU COCHE CORRECTAMENTE");
	}
	
	void avanzar(float kilometros, Coche[] fa) {
		Fabrica.buscaCoche(matricula, fa);
		kilometros += 100;
		JOptionPane.showMessageDialog(null,"EL MECÁNICO HA ESTADO PROBANDO EL COCHE Y HA RECORRIDO 100 KILÓMETROS\nSU COCHE AHORA TIENE UN TOTAL DE "+kilometros+" KILÓMETROS. ");
		//El mecánico recorre kilómetros y hace avanzar el cuenta, muestra mensaje y sube el cuenta,
	}
	void tunear() {
		kilometros = 0;
		JOptionPane.showMessageDialog(null,"HEMOS PUESTO SU CUENTA KILÓMETROS A CERO");
		if(techoSolar == false) {
			techoSolar = true;
			JOptionPane.showMessageDialog(null,"LE HEMOS INSTALADO EL TECHO SOLAR.");
		}
		//Deja cuenta kilometros a cero e instala techo solar si no lo tenía.
	}
	void tunear(String color) {
		
		color = JOptionPane.showInputDialog("¿DE QUÉ COLOR QUIERE PINTAR SU COCHE?: ");
		
		JOptionPane.showMessageDialog(null,"HEMOS PINTADO SU COCHE DE "+color.toUpperCase());
		//Sobrecarga el anterior, pinta el coche, cuenta a cero, pone techo solar y muestra mensaje.
	}
	void matricular(String matricula) {
		//Matricula un coche y muestra el mensaje.
		if(this.matricula == "9012-HH") {
			this.matricula = "3456-XS";
			this.marca = "VW";
			this.modelo = "Caddy";
			this.numPuertas = 5;
			this.numPlazas = 7;
			this.kilometros = 500;
		}
		if(this.matricula == "5678-AG") {
			this.matricula = "9012-HH";
			this.marca = "BMW";
			this.modelo = "850";
			this.numPuertas = 5;
			this.numPlazas = 5;
			this.kilometros = 400;
		}
		if(this.matricula == "1234-DF") {
			this.matricula = "5678-AG";
			this.marca = "Fiat";
			this.modelo= "Uno";
			this.kilometros = 300;
			this.numPuertas = 3;
			this.numPlazas = 2;
		}
		if(this.matricula == "") {
			this.matricula = "1234-DF";
			this.modelo = "Toledo";
			this.kilometros = 200;
		}
		
		JOptionPane.showMessageDialog(null,"HEMOS MATRICULADO SU COCHE, SU MATRÍCULA ES: "+this.matricula);
		}
	
	void fin() {
		JOptionPane.showMessageDialog(null,"HASTA PRONTO "+usuario.toUpperCase());
	}
	
	
}
