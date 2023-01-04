package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Primitive_collection {
	
	public void Arrlist() {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Kaushik");   //add items to the list
		list.add("cricket");
		list.add("football");
		
		System.out.println("The arrayList is:" + list);
		
		System.out.println("Element at 1st position is: "+list.get(0)); //access a element at a index
		
		list.set(1, "Assignment");  // replace element with other element
		System.out.println("The new arrayList is:" + list);
		
		Collections.sort(list);    //sort the elements of arraylist
		System.out.println("The sorted arrayList is:" + list);
		
		Iterator<String> iterate = list.iterator();  //traverse arraylist using iterator
	    System.out.print("ArrayList: ");
	    while(iterate.hasNext()){
	      System.out.print(iterate.next());
	      System.out.print(", ");
	    }
	    
	    list.clear(); //Emptying the entire list
		
	}
	
	public void set() {
		HashSet<String> cars=new HashSet<>();
		
		cars.add("Maruti");   //Adding elements to set
		cars.add("BMW");
		cars.add("ferrari");
		
		System.out.println(cars);  //print the set
		
		cars.remove("BMW");  //To remove element from set
		cars.contains("BMW"); //check if set has the element
		
		Integer[] a= {1,2,3,4,5,6};
		Integer[] b= {3,5,7,8,9};
		
		HashSet<Integer> set1 = new HashSet<Integer>();    //creating two sets
        set1.addAll(Arrays.asList(a));    
        HashSet<Integer> set2 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(b));    
        
        HashSet<Integer> union = new HashSet<Integer>(set1);        // To find union
        union.addAll(set2);
        System.out.println("Union of the two Set: " + union);
        
        HashSet<Integer> intersection = new HashSet<Integer>(set1);    // To find intersection
        intersection.retainAll(set2);
        System.out.println("Intersection of the two Set: " + intersection);
        
        HashSet<Integer> difference = new HashSet<Integer>(set1);       // To find the symmetric difference
        difference.removeAll(set2);
        System.out.println("Difference of the two Set: " + difference);
		
	}
	
	public void hashmap() {
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "Cat");
		map.put(2, "Dog");
		map.put(3, "Lion");
		
		//Traversing a map
		for(HashMap.Entry m:map.entrySet()){  
			 System.out.println(m.getKey()+" "+m.getValue());  
	    }  
		
		System.out.println("The value at key 2: "+ map.get(2));
		
		map.remove(2);  // remove element from map
		
		System.out.println(map.containsKey(2));   // check if a key is present
		
		System.out.println("Map size: "+map.size());
		
	}

	public static void main(String[] args) {
		Primitive_collection prim=new Primitive_collection();
		
		System.out.println("ArrayList");
		prim.Arrlist();
		System.out.println("HashSet");
		prim.set();
		System.out.println("HashMap");
		prim.hashmap();

	}

}
