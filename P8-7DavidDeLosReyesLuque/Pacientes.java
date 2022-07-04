import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;

public class Pacientes {
	
	private String nombre, estado;//VARIABLES
	private String edad;
	private float peso;
	private float estatura;
	private double imc;
	private String provincia;
	private String sexo;
	private String dieta;

	public Pacientes() {}//CONSTRUCTOR VACÍO
	
	public Pacientes(String nombre, String estado, String edad, float peso, float estatura, double imc, String provincia, String sexo, String dieta) {//CONSTRUCTOR CON PARÁMETROS
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.imc = imc;
		this.provincia = provincia;
		this.sexo = sexo;
		this.dieta = dieta;
	}
	
	public String getNombre() {//SETTERS Y GETTERS
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	
	void calculaIMC() {//MÉTODO QUE CALCULA EL IMC
		imc = peso/(estatura *  estatura);
	}
	void calculaEstado() {//MÉTODO QUE CALCULA EL ESTADO DEL PACIENTE
			if (imc < 16) {
				estado = " Tiene desnutrición grado 3.";
			}
			else if (imc >= 16 && imc < 17) {
				estado = " Tiene desnutrición grado 2.";
			}
			else if (imc >= 17 && imc < 18.5) {
				estado = " Tiene desnutrición grado 1.";
			}
			else if (imc >= 18.5 && imc < 25) {
				estado = " Su IMC es normal.";
			}
			else if (imc >= 25 && imc < 30) {
				estado = " Tiene sobrepeso grado 1.";
			}
			else if (imc >= 30 && imc < 40) {
				estado = " Tiene sobrepeso grado 2.";
			}
			else if (imc >= 40) {
				estado = " Tiene sobrepeso grado 3.";
			}
	}
	
	public String mostrarDatos() {
		return "* Nombre: "+ getNombre() +"\n* Edad: "+ getEdad() +"\n* Peso: "+ getPeso() +"\n* Estatura: "+ getEstatura() +"\n- Provincia: "+ getProvincia() +"\n- Sexo: "+ getSexo() +"\n- Dieta: "+ getDieta() +"\n* IMC: "+ getImc() +"\n* Estado: "+ getEstado();

	}

	@Override
	public String toString() {
		return "Pacientes [nombre=" + nombre + ", estado=" + estado + ", edad=" + edad + ", peso=" + peso
				+ ", estatura=" + estatura + ", imc=" + imc + ", provincia=" + provincia + ", sexo=" + sexo + ", dieta="
				+ dieta + "]";
	}
	
	
}
