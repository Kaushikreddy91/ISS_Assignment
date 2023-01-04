package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//Comparator is efficient than comparable because for comparable we need to change the structure and code of the base class.

class Students{
	int id;
	String name;
	int marks;
	
	Students(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
}

class markscomparator implements Comparator<Students>{
	public int compare(Students first,Students second) {
		return Integer.compare(first.getMarks(), second.getMarks());
	}
}
public class Comparator_inf {

	public static void main(String[] args) {
		ArrayList<Students> Slist=new ArrayList<>();
		Slist.add(new Students(1,"Kaushik",65));   //add items to the list
		Slist.add(new Students(2,"Walter",54));
		Slist.add(new Students(3,"Daemon",60));
		Slist.add(new Students(4,"Rahul",70));
		Slist.add(new Students(5,"Varun",46));
		
		System.out.println("List Before Sorting: ");
		System.out.println(" ID    Name    Marks");
		for(Students st:Slist){	
			System.out.println("  "+st.id+"   "+st.name+"    "+st.marks);
		}
		
		markscomparator comp=new markscomparator();
		Collections.sort(Slist,comp);
		
		System.out.println(" ");
		System.out.println("List After Sorting based on Marks: ");
		System.out.println(" ID    Name    Marks");
		for(Students st:Slist){	
			System.out.println(" "+st.id+"  "+st.name+"  "+st.marks); 
		}
	}

}
