
public class Cartas {
	
	private String[] pregunta = {"Capital de Italia","Capital de Francia","Capital de Alemania","Capital de Holanda"};
	private String[] respuesta = {"Roma","París","Berlín","Amsterdam"};
	
	public Cartas() {}

	public Cartas(String[] pregunta, String[] respuesta) {
		super();
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

	public String[] getPregunta() {
		return pregunta;
	}

	public void setPregunta(String[] pregunta) {
		this.pregunta = pregunta;
	}

	public String[] getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String[] respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Cartas [pregunta=" + pregunta + ", respuesta=" + respuesta + "]";
	}
	
	

	
	

}
