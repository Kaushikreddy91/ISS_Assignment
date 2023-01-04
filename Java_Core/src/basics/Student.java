package basics;

public class Student {   //CLASS
	String name;
	int age;
	String id;
	
	//CONSTRUCTOR
	public Student(String name,int age,String id) {
		this.name=name;
		this.age=age;
		this.id=id;	
	}
	
	//METHOD1
	public String getId() {
		System.out.println("The student id:"+ id);
		return id;
	}
	
	//METHOD2
	public String print() {
		return("Student Name: "+ name +"\n Age: "+age+"\n Student Id: "+ id);
	}
	public static void main(String[] args) {
		Student std1=new Student("Kaushik",21,"ISS2023"); //OBJECT
		std1.getId();
		System.out.println(std1.print());
	}

}
