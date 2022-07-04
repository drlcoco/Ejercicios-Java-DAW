
public class Fabrica {

	public static void main(String[] args) {
		
		Coche car = new Coche();
		Coche[] fa = new Coche[4];
		
		car.bienvenida();
		
		fa[0] = new Coche();
		fa[1] = new Coche(Coche.getMatricula());
		fa[2] = new Coche(Coche.getNumPuertas(), Coche.getNumPlazas());
		fa[3] = new Coche(Coche.getMarca(), Coche.getModelo(), Coche.getColor());
		
		for (int i = 0; i < fa.length; i++) {
			fa[i].avanzar(Coche.getKilometros());
			fa[i].tunear();
			fa[i].tunear(Coche.getColor());
			fa[i].matricular(Coche.getMatricula());
			caracteristicas(i);
		}
		
	}
	public static String caracteristicas(int i) {

		System.out.println("\n - COCHE "+(i+1)+":\n - MATRÍCULA: "+ Coche.getMatricula()+"\n - MARCA: "+Coche.getMarca()+"\n - MODELO: "+ Coche.getModelo()+"\n - COLOR: "+ Coche.getColor()+"\n - TECHO SOLAR: "+Coche.techoSolar()+"\n - KILÓMETROS: "+Coche.getKilometros()+"\n - PUERTAS: "+Coche.getNumPuertas()+"\n - PLAZAS: "+Coche.getNumPlazas()+"\n");

		//Muestra toda la informacion del coche.
	   return "";
	}
	
	
}
