import java.awt.*;

public abstract class Animal {
	Image picture;
	String food;
	boolean hunger;
	String boundaries;
	String location;
	
	public abstract void makeNoise();
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("El animal está durmiendo");		

	}
	
	public abstract void roam();
}
