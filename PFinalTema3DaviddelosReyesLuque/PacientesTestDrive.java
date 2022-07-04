

public class PacientesTestDrive {

		public static void main(String[] args) {
			
			Pacientes pa = new Pacientes();
			
			pa.bienvenida();
			pa.pacientes();
			
			Pacientes[] p = new Pacientes [pa.numeroPacientes];
			
			for ( int i=0; i<pa.numeroPacientes; i++) {
				p[i] = new Pacientes();
			    p[i].obtenDatos();
			    p[i].calculaIMC();
			    p[i].muestraDatos();
			    p[i].calculaEstado();
			}
			
			pa.edMinima = pa.edMaxima = p[0].edad;
			
			for ( int j=1; j<pa.numeroPacientes; j++) {
				
				   if (p[j].edad>pa.edMaxima) {
					
					   pa.edMaxima = p[j].edad;
				   }
				
				   if (p[j].edad<pa.edMinima) {
					
					   pa.edMinima = p[j].edad;
					
				   }
			}
			
			pa.edadMaxima();
			
			pa.edadMinima();
			
			for (int x=0; x<p.length; x++) {
				pa.peMedio = pa.peMedio + p[x].peso;
			}
			pa.peMedio = pa.peMedio / pa.numeroPacientes;
			
			pa.pesoMedio();
			
			for (int y=0; y<p.length; y++) {
				pa.estMedia = pa.estMedia + p[y].estatura;
			}
			pa.estMedia = pa.estMedia / pa.numeroPacientes;
			
			pa.estaturaMedia();
				
			pa.fin();
			
			
		}

	

}
