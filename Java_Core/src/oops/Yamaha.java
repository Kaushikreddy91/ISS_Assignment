package oops;

public class Yamaha extends Vehicle{
	
	private String model;     // Encapsulation
	
	public String get() {
		System.out.println(model);
		return model;
	}
	public void set(String modelname) {
		this.model=modelname;
	}
	
	public void speed() {
		System.out.println("The speed is 110kmph");
	} 
	void no_of_wheels() {
		System.out.println("It has two wheels");
	}
	void cost() {
		System.out.println("It costs around 1 Lakh");
	}
	void name() {
		System.out.println("The name of the vehicle is Yamaha");
	}

	public static void main(String[] args) {
		Yamaha y=new Yamaha();
		y.set("fzx");
		y.get();
		y.speed();
		
	}

}
