import java.util.Scanner;

public class ADibujarExagonos {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		char c;
		int a = 0;
		System.out.println("Introduzca un número: ");
		a = datos.nextInt();
		System.out.println("Introduzca un carácter: ");
		c = datos.next().charAt(0);
		a = a+2;
		
		for(int i=a/2;i<=a;i++){
			
			for(int k=a-i;k>0;k--){
				System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++){
				System.out.print(c);
			}
		
			for(int y=1;y<i-1;y++){
				System.out.print(c);
			}
		
			System.out.println();
		}
		
		for(int m=a-1;m>=a/2;m--){
		
			for(int p=a-m;p>0;p--){
				System.out.print(" ");
			}
		
			for(int n=1;n<=m-1;n++){
				System.out.print(c);
			}
		
			for(int l=1;l<m;l++){
				System.out.print(c);
			}
		
			System.out.println();
		}
	}
}
