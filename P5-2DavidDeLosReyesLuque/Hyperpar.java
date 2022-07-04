import java.util.Scanner;

public class Hyperpar {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
						
		String numero = "0";
		
		while (Integer.parseInt(numero) >= 0 && Integer.parseInt(numero) < Math.pow(10, 9)) {
			int si = 0;
			int no = 0;
			System.out.println("Introduzca un número: ");
						
			numero = datos.nextLine();
			
			int array[] = new int[numero.length()];
			
			Integer.parseInt(numero);
		
			for (int i = 0; i < array.length; i++) {			
				if(numero.toCharArray()[i] % 2 == 0) {
					si++;
				}
			
				if(numero.toCharArray()[i] % 2 > 0) {
				no++;
				}
			
			}
			
			if (no == 0) {
				System.out.println("SI");
			}
		
			if (no > 0){
				System.out.println("NO");
			}
			
		}
		
		if (Integer.parseInt(numero)<0) {
			System.out.println("Fin");
		}
		
	}

}
