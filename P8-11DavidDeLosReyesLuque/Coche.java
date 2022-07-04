
public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int numCoches = 0;
	private int MAX_VEHICULOS = 5;
	
	public Coche() {}//CONSTRUCTOR VACÍO

	public Coche(String matricula, String marca, String modelo, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return matricula + ", " + marca + ", " + modelo + ", " + color + "\r\n";
	}

	public String getMatricula() {
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
	public int getNumCoches() {
		return numCoches;
	}

	public void setNumCoches(int numCoches) {
		this.numCoches = numCoches;
	}
	public int getMAX_VEHICULOS() {
		return MAX_VEHICULOS;
	}

	public void setMAX_VEHICULOS(int mAX_VEHICULOS) {
		MAX_VEHICULOS = mAX_VEHICULOS;
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

}
