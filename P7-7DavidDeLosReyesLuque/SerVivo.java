
public abstract class SerVivo {
	
	protected String nombre;
					
	public SerVivo(String nombre) {
		
		this.nombre = nombre;
	}
	
	public abstract void alimentacion();
	
	public abstract void caracteristicas();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
