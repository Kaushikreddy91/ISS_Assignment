package oops;

public abstract class Vehicle {  //Abstract class
	public void speed() {
		System.out.println("The speed is normal");
	}
	
	abstract void no_of_wheels();
	abstract void cost();
	abstract void name();
}
