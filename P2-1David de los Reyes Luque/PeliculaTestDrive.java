
public class PeliculaTestDrive {
	public static void main (String[] args) {
	    Pelicula uno = new Pelicula();
		uno.titulo = "Blancanieves y los siete enanitos";
		uno.genero = "infantil";
		uno.calificacion = -2;
		uno.proyectar();
		Pelicula dos = new Pelicula();
		dos.titulo = "No habra paz para los malvados";
		dos.genero = "Thriller";
		dos.calificacion = 127;
		dos.proyectar();
		Pelicula tres = new Pelicula();
		tres.titulo = "Bailando bajo la lluvia";
		tres.genero = "musical";
		tres.calificacion = 5;
		tres.proyectar();
	  
	}

}
