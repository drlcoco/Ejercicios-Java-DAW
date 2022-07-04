

public class Fichero {
	static int calcArea(int height, int width) {
		return height*width;
	}
	public static void main(String[] args) {		
		int a =  calcArea(7, 12);
		short c = 7;
		calcArea(c, 15);
		int d =  calcArea(57, 2);//Añado un int 2
		calcArea(2, 3);
		int t = 42;//Cambio la variable long por int
		int f = calcArea(t, 17);
		int g = calcArea(2,2);// Añado dos int con valor 2
		calcArea(2,2);//Añado dos int con valor 2
		int h = calcArea(4, 20);//Cambio la variable byte por int
		int j = calcArea (2, 3);//Quito la tercera variable que tiene valor 5 
		System.out.println(a+"/ "+c+"/ "+d+"/ "+t+"/ "+f+"/ "+g+"/ "+h+"/ "+j);
	}

}
