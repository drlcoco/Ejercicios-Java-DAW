import java.io.Serializable;
import java.util.Arrays;

public class Jugador implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int poder;
	private String tipo;
	private String[] armas = new String[3];
	
	public Jugador() {}
	
	public Jugador(int poder, String tipo, String[] armas) {
		
		this.poder = poder;
		this.tipo = tipo;
		this.armas = armas;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String[] getArmas() {
			return armas;
	}

	public void setArmas(String[] armas) {
		this.armas = armas;
	}

	@Override
	public String toString() {
		return "Jugador [poder=" + poder + ", tipo=" + tipo + ", armas=" + Arrays.toString(armas) + "]";
	}

}
