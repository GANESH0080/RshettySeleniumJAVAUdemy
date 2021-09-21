package Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;


@Test
public class StreamExample {

	public void arrayList() {
		// Count the number of Names which start from letter A

		// Created AraayList
		List<String> totalLetter = new ArrayList<String>();
		// Adding the Element into the ArrayList
		totalLetter.add("Ganesh");
		totalLetter.add("rnav");
		totalLetter.add("Shlok");
		totalLetter.add("Ajay");
		totalLetter.add("Bhavika");
		totalLetter.add("Alex");

		// Printing the ArrayList
		System.out.println("Total ArrayList is:" + " " + totalLetter);

		int startwithA = 0;
		/*
		 * // Using Enhance for loop we are printing the arraylist elements for (String
		 * letters : totalLetter) {
		 * System.out.println("All the ArraList elements under the Enhance For Loop :" +
		 * " " + letters); }
		 */
		// Using for Loop we are printing the arraylist elements
		for (int i = 0; i < totalLetter.size(); i++) {

			// Checking is elements startwith A letter or not using IF
			if (totalLetter.get(i).startsWith("A")) {
				// If started with A then printing the name of element
				System.out.println("For Loop all the ArraList elements:" + " " + totalLetter.get(i));
				// Incrementing the count If start with A
				startwithA++;
			}

		}
		// Printing total elements start with A
		System.out.println("Total count of names which start from A letter is : " + " " + startwithA);
        System.out.println("---------- Checking how many numbers start with A using For Loop  -------------------------------");
	}
	
	
	

	//All above code we will written in one line using Stream
	public void usingStream()
	{
		// Count the number of Names which start from letter A

				// Created AraayList
				List<String> totalLetter = new ArrayList<String>();
				// Adding the Element into the ArrayList
				totalLetter.add("Akash");
				totalLetter.add("rnav");
				totalLetter.add("Shlok");
				totalLetter.add("Ajay");
				totalLetter.add("a");
				totalLetter.add("Alex");

				// Printing the ArrayList
				System.out.println("Total ArrayList is:" + " " + totalLetter);
				
				// Stream is an API and Filter is a method of stream
				// First we are converting our Arraylist into Stream and using Filter method we are validation which element start with A
				// in filter we are using Lambda expression with parameter as S (Which store all arraylist values)
				// We are using strem because strem veryfying the arraylist parellaly so its fast
				// In above example we used for loop for loop iterating element in sequential order so its taking time
				// We have 2 operations Intermidiate operation and Terminal operation
				// Intermidiate means strems are in filter so that is filter
				// Terminla means Acion perform when we get the result after action so that is count()
				long totalnames = totalLetter.stream().filter(s->s.startsWith("A")).count();
				System.out.println("In Stream names started with A count is :" +" " +totalnames);
				 System.out.println("---------- Stream Example 1 Completed  -------------------------------");
				
				 
				// Example 2
				// Instead of creating collections like arraylist and then converting into stream.
				// We can directly create the stream with element
				long num = Stream.of("om","Jasmin","alexa","amit").filter(a->a.startsWith("J")).count();
				System.out.println("In Stream names started with A count is :" +" "+num);
				 System.out.println("---------- Stream Example 2 Completed  -------------------------------");
				
				 
				//Example 3
				//How to print the elements whose length greater than 4
	            Stream.of("om","Jasmin","alexa","amiterr").filter(q-> q.length()>4).forEach(q->System.out.println(q));
	            System.out.println("---------- Stream Example 3 Completed  -------------------------------");
	            
	            //Example 4
	            // Want to print only First Result
	            Stream.of("om","Jasn","alexa","amiterr").filter(j-> j.length()>4).limit(1).forEach(j->System.out.println(j));
	            System.out.println("---------- Stream Example 4 Completed  -------------------------------");
	            
	            
				
				/*
				// Example 4
				long again = Stream.of("om","Jasmin","alexa","jay").filter(z->
				{
				 z.startsWith("J");
				}).count();
				
				
				System.out.println("In Stream names started with A count is :" +" "+again);
				*/
				

	}
	
	
	
	
	
	
	
}



