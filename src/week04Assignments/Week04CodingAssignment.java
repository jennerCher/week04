package week04Assignments;


import java.util.ArrayList;
import java.util.List;


public class Week04CodingAssignment {

	public static void main(String[] args) {
	// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	List<Integer> ages = new ArrayList <Integer>();
	
	ages.add(3);
	ages.add(9);
	ages.add(23);
	ages.add(64);
	ages.add(2);
	ages.add(8);
	ages.add(28);
	ages.add(93);
			
	//Programmatically subtract the value of the first element in the array from the value in the last element of the array. Print the result to the console.  
	
	int result = (ages.getLast() - ages.getFirst());
	
	System.out.println(result);
	
	List <Integer> ages2 = new ArrayList <Integer>();
	
	ages2.add(32);
	ages2.add(7);
	ages2.add(23);
	ages2.add(15);
	ages2.add(2);
	ages2.add(3);
	ages2.add(7);
	ages2.add(42);
	ages2.add(19);
	
	//show 9 elements in the array
	System.out.println(ages2.size());
	
	//Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
	
	int result2 = (ages2.getLast() - ages2.getFirst());
	
	System.out.println(result2);
	
	//Show that using the index values for the elements is dynamic
	
	for (int i = 0; i <ages.size(); i++);
		System.out.println(ages);
	for (int i = 0; i <ages2.size(); i++);
		System.out.println(ages2);
	
		
	//Use a loop to iterate through the array and calculate the average age. Print the result to the console.	
		
	double sum = ages.get(0);
	double average = ages.get(0);
		for (int i = 0; i <ages.size(); i++) {
		sum = sum + ages.get(i);
		average = sum/ages.size();
		}
	System.out.println("The average age is " + average);
	
	//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	
	String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//Use a loop to iterate through the array and calculate the average number of letters per name
	
	double sumLetters = 0; 
	
			

	for (int i = 0 ; i< names.length; i++){
		sumLetters = sumLetters + names[i].length();
		
		}
	double averageLetters = sumLetters/names.length; 
	System.out.println("The average number of letters per name is " + averageLetters);	
	
	//How do you access the last element of any array? by subtracting one from the array length and using that number as your array index
	System.out.println("The last element in the array is " + names[names.length - 1]);
	
	//How do you access the first element of any array? element indices start at 0
	
	System.out.println("The first element in the array is " + names[0]);
	
	//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	
	List <Integer> nameLengths  = new ArrayList <Integer>(); 
		
	for (int i = 0; i < names.length; i++) {
		
		nameLengths.add(names[i].length());
	
	}
	System.out.println(nameLengths);
	
	//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	
	int sumElements = 0;
	
	for (int i = 0; i < names.length; i++) {
		
		sumElements = sumElements + names[i].length();
		
	}
	
	System.out.println("" + sumElements);
	System.out.println(concatenateWord("Hello", 3));
	System.out.println(fullName("Cheryl", "Jennerjohn"));
	System.out.println(sumGreaterThan100());
	System.out.println(calculateAverage());
	System.out.println(firstArraySecond());
	System.out.println(willBuyDrink());
	System.out.println(soMuchCoding());
	
	}
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	public static String concatenateWord(String word, int n) {
	String result2 = "";	
		
			for (int i = 0; i < n; i++) {
				result2.concat(word);
				result2 = result2.concat(word);
														
		}
		
		
		return result2;	
			
	}
	
//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	public static String fullName(String firstName, String lastName) {
		String fullNameResult = firstName + " " + lastName;
		return fullNameResult;
		
	}
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sumGreaterThan100() {
		
		List <Integer> numbers = new ArrayList<>();
		
		numbers.add(40);
		numbers.add(35);
		numbers.add(50);
		
		int sum = 0;
		boolean result = true;
		
		for (int i = 0; i <numbers.size(); i++ ) {
			
			sum = sum + numbers.get(i);
			
			if (sum > 100) {
				result = true;
			}	else
				result = false;
		
		}
		
		return result;
		
		
		
	}
	//Write a method that takes an array of double and returns the average of all the elements in the array
	public static double calculateAverage() {
		
		List <Double> average = new ArrayList<>();
		
		average.add(30.0);
		average.add(54.0);
		average.add(57.0);
		
		double sum = average.get(0);
		
		
		for (int i = 0; i < average.size(); i++) {
		
		sum = sum + average.get(i);
		
					
		}
		double result = sum/average.size();
		return result;
	}
	
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstArraySecond() {
		List <Double> average = new ArrayList<>();
		List <Double> average2 = new ArrayList<>();
		
		average.add(30.0);
		average.add(54.0);
		average.add(57.0);
		
		average2.add(20.0);
		average2.add(34.0);
		average2.add(47.0);
		
		double sum1 = average.get(0);
		double sum2 = average.get(0);
		
		for (int i = 0; i < average.size(); i++) {
				sum1 = sum1+ average.get(i);}
		for (int i = 0; i <average2.size(); i++) {
				sum2 = sum2 + average.get(i);
				
		}
		double result1 = sum1/average.size();
		double result2 = sum2/average2.size();
		boolean result = true;
		if (result1 > result2) {
			result = true;
		} else
		{
			result = false;
		}
		return result;
			

	}
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink() {
		boolean isHotOutside = true;
		double moneyInPocket = 12.50;
		
		if (isHotOutside = true && moneyInPocket > 10.5) {
			
			isHotOutside = true;
			
		} else
		{
			isHotOutside = false;
		}
		return isHotOutside;
	}
	public static String  soMuchCoding() {
		String result = "";
		int hoursSpentCoding = 9;
		if (hoursSpentCoding < 10) {
			System.out.println("Not enough hours coding!");
		}
		else
		{
			System.out.println("Nice work this week!");
		}
		return result;
		
	}
}

	//

		
		
	
	
	

	
	

	
	



