
public class Coche {
	
	private static String matricula = "";
	private static String marca = "SEAT";
	private static String modelo = "ALTEA";
	private static String color = "blanco";
	private static boolean techoSolar = false;
	private static float kilometros = 0;
	private static int numPuertas = 3;
	private static int numPlazas = 5;
	int opcion = 0;
	
	public Coche() {
		
	}
	
	public Coche(String matricula) {
		this.matricula = matricula;
	}
	public Coche(int numPuertas, int numPlazas) {
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
	}
	public Coche(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public static String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public static String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
			this.marca = marca;
	}

	public static String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static boolean techoSolar() {
		return techoSolar;
	}

	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public static float getKilometros() {
		return kilometros;
	}

	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}

	public static int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		if(numPuertas > 0) {
			this.numPuertas = numPuertas;
        }
	}

	public static int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	
	void bienvenida() {
		System.out.println("BIENVENIDO A COCHES DE LOS REYES.");
	}
	void avanzar(float kilometros) {
		kilometros = kilometros + 100;
		System.out.println("EL MECÁNICO HA ESTADO PROBANDO EL COCHE Y HA RECORRIDO 100 KILÓMETROS\nSU COCHE AHORA TIENE UN TOTAL DE "+kilometros+" KILÓMETROS. ");
		//El mecánico recorre kilómetros y hace avanzar el cuenta, muestra mensaje y sube el cuenta,
	}
	void tunear() {
		kilometros = 200;
		System.out.println("HEMOS PUESTO SU CUENTA KILÓMETROS A CERO");
		if(techoSolar == false) {
			techoSolar = true;
			System.out.println("LE HEMOS INSTALADO EL TECHO SOLAR.");
		}
		//Deja cuenta kilometros a cero e instala techo solar si no lo tenía.
	}
	void tunear(String color) {
		 
		if(this.color == "rojo") {
			this.color = "gris";
		}
		else if(this.color == "azul") {
			this.color = "rojo";
		}
		else if(this.color == "blanco") {
			this.color = "azul";
		}
		else {
			this.color = "blanco";
		}
		
		System.out.println("HEMOS PINTADO SU COCHE DE "+color);
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
		
		System.out.println("HEMOS MATRICULADO SU COCHE, SU MATRÍCULA ES: "+this.matricula);
		
		
		
	}
	
}
