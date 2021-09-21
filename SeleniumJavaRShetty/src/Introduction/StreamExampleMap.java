package Introduction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamExampleMap {

	// Stream examples with Map

	@Test
	public void streamtesting() {
		// Created the Stream
		// Used Filter method and get the element which ends with "e"
		// Converted that element in uppercase letter
		// Printing that same element.
		Stream.of("Ganesh", "Salunkhe", "Mahadev", "Bal").filter(g -> g.endsWith("e")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("Printing the name in uppercase hich ends with E: " +" " +s));

		// If you want to print only all the letter in upper case then no need to write the Filter method 
		// We can directly write map only
		Stream.of("Ganesh", "Salunkhe", "Mahadev", "Bal").map(s -> s.toUpperCase())
		.forEach(s -> System.out.println("Printing all the name:" +" "+s));
		
		//Printing the names in Uppercase letter and sorted order which start with G
		Stream.of("Gourav", "Salunkhe", "Ganesh", "Bal").filter(g -> g.startsWith("G")).map(s -> s.toUpperCase()).sorted()
		.forEach(s -> System.out.println("Sorted names are :" +" " +s));

		
		//Printing the names in Uppercase letter and sorted order which start with G
		//Creating as array
		String[] names = {"Gourav","Shree","OM","Bhavika","Ganesh"};
		
		//Converting array into arraylist
	    List<String> arrayList = 	Arrays.asList(names);
	
	    //Using Stream converting the arrayList into strem
	    //Printing the names in lowercase with start with G
	    arrayList.stream().filter(a->a.startsWith("G")).map(a->a.toLowerCase()).sorted()
	    .forEach(a->System.out.println("Printing name start with G:" +" "+a));
	    
	    //How to Print all the Arraylist element in Sorting
	    arrayList.stream().sorted().forEach(s->System.out.println(s));
	    
	    
	    
		//Converting array into arraylist
	    List<String> arrayListTwo = 	Arrays.asList("Praful","Alex", "John", "Zen");
	    
	    // Merging 2 Arraylist and printed in sorting order
	    // Stream is a type created new variable "newStream" just like Arraylist
	    // Merging two stream using Concat
	    Stream <String> newStream = Stream.concat(arrayList.stream(), arrayListTwo.stream());
	    //Sorted merged strem and printing
	    //newStream.sorted().forEach(a->System.out.println("Both Arraylist in Sorting order:" +" " +a));
	    
	    //Verifying specific element present in Arraylist or stream ot not
	    boolean textverify = newStream.anyMatch(s->s.equalsIgnoreCase("Ganesh"));
	    Assert.assertTrue(textverify);
	    
	    
	    
	    
		
	}
	
	//Created new List using Stream or existing list or some operations
	@Test
	public void CollectinList()
	{
		// Created List using List type and variable name is Ls
		// Using Collect method converted stream or existing list into LIST
	List <String> ls =  Stream.of("Ganesh","Mahadev","Salunkhe","Mohan", "Misstri").filter(s->s.startsWith("M")).map(s->s.toUpperCase())
	 .collect(Collectors.toList());
	
	//Printing newly created list
	System.out.println("Created new LISt is" +" " +ls);
	// Creating opetaions on new created List
	ls.stream().filter(n-> n.endsWith("I")).forEach(n->System.out.println("Printing string endsup with" +" " +n));
	//Printing 0th index from List 
    System.out.println(ls.get(0));
	
	 
	}
	
	@Test
	public void UniqueNum()
	{
		// Printing the Unique Element from Stream / list
		Stream.of(1,3,2,7,4,5,6,5,4).distinct().sorted().forEach(s->System.out.println("Distinct elements are:" +" " +s));
		
		
		//Created ArryList 
		//Coverted into Stream
		// Again converted into List
		// getting the 3rd index from list
		ArrayList<Integer> vlu = new ArrayList<Integer>();
		vlu.add(5);
		vlu.add(3);
		vlu.add(2);
		vlu.add(6);
		vlu.add(5);
		vlu.add(4);
		vlu.add(59);
		System.out.println(vlu.stream().distinct().sorted().collect(Collectors.toList()).get(3));
	
				
	}
}
