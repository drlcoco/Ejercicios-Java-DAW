public class Reloj {
    public static void main(String[] args) {
        int segundos;
        int minutos;
        int horas;
        int dias;
        
        segundos=8432100;
        
        minutos = segundos/60;
        segundos -= minutos * 60;
        
        horas = minutos/60;
        minutos -= horas * 60;
        
        dias = horas/24;
        horas -= dias * 24;
        
        
                  System.out.print( dias+ " días, ");
                  System.out.print( horas+ " horas, ");
                  System.out.print( minutos+ " minutos y ");
                  System.out.print(segundos+ " segundos ");
                  

                  
              
    }
}
