import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class Carta {
	
	private String pregunta;
	private String respuesta;
		
	public Carta() {}
	
	public Carta(String pregunta, String respuesta) {
		
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	@Override
	public String toString() {
		return "Carta [pregunta=" + pregunta + ", respuesta=" + respuesta + "]";
	}

}
