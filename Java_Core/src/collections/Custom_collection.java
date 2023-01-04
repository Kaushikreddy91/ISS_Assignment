package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}


public class Custom_collection {
	
	public void Arrlist() {
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(1,"Kaushik"));   //add items to the list
		list.add(new Student(2,"Walter"));
		list.add(new Student(3,"Daemon"));
		
		for(Student st:list){				  // Traversing the list
			System.out.println("Student ID " +st.id);
		     System.out.println("Student's name: " +st.name); 
		} 
		
		list.set(1, new Student(4,"Rahul"));       // replace element with other element
	    
		list.clear(); //Emptying the entire list
		
	}
	
	public void hset() {
		HashSet<Student> Set=new HashSet<>();
		
		Set.add(new Student(1,"Kaushik"));   //Adding elements to set
		Set.add(new Student(2,"Walter"));
		Set.add(new Student(3,"Daemon"));
		
		System.out.println("The size is: "+Set.size());
		
		//Iterate over the objects in the set
		Iterator<Student> iterator = Set.iterator();
		Student s;
		while(iterator.hasNext()) {
			s = iterator.next();
			System.out.println(s.id + " " + s.name);
		}
		
	}

	public static void main(String[] args) {
		Custom_collection cc=new Custom_collection();
		cc.Arrlist();
		
		cc.hset();
	}

}
