package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		
	//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
	List<Integer> citis_area= new ArrayList<Integer>();
	citis_area.add(24884);
	citis_area.add(245353);
	citis_area.add(85757);
	citis_area.add(8788);
	citis_area.add(456565);
	
	System.out.println("Combined area of 3rd and 4th citis are: "+ (citis_area.get(2)+citis_area.get(3)) + " m2");
	
	
	//Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
	Set<String> tourist_attractions = new HashSet<String>();
	
	tourist_attractions.add("Thiland");
	tourist_attractions.add("Vietnam");
	tourist_attractions.add("Bhutan");
	tourist_attractions.add("Georgia");
	tourist_attractions.add("London");
	tourist_attractions.add("Paris");
	tourist_attractions.add("Switzerland");
	tourist_attractions.add("Singapore");
	tourist_attractions.add("Japan");
	tourist_attractions.add("Cambodia");
	
	System.out.println("Top tourist attractions are" + tourist_attractions);
	System.out.println("Size is:"+ tourist_attractions.size() );
	
	
	
	
	/*
	 * for(int i=0;i<10;i++) { System.out.println(tourist_attractions
	 * +"Total attraction:"+ tourist_attractions.size() );
	 * System.out.println(tourist_attractions.get(i).size();
	 * 
	 * }
	 */
	 
	
	//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
	List<Double> numbers = new LinkedList<Double>();
	numbers.add(1.00);
	numbers.add(2.00);
	numbers.add(3.00);
	numbers.add(4.00);
	numbers.add(5.00);
	numbers.add(6.00);
	numbers.add(7.00);
	numbers.add(8.00);
	numbers.add(9.00);
	numbers.add(10.00);	
	
	System.out.println("Average of 5th and 6th numbers is: "+ (numbers.get(4)+numbers.get(5))/2);
	 
	
	
	//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
	String[] movies = {"DDLJ","Spider man","Kantara","Titanic","Harry Potter"};
	System.out.println("3rd movie in the list is:" + movies[2]);
	

	}

}
