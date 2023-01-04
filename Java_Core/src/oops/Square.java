package oops;

public class Square implements Polygon {
	public int getArea(int size) {
		int area=4*size;
		return area;
	}
	
	public void side(){
		System.out.println("I have 4 sides");
	}
	
	public void name(){
		System.out.println("The name of the polygon is Square");
	}
	
	public static void main(String args[]) {
		Square s=new Square();
		s.getArea(4);
		s.side();
		s.name();
	}

}
