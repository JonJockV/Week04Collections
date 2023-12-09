package Week04Project;

import java.util.ArrayList;
import java.util.List;

public class Week04Project {

	public static void main(String[] args) {
		//New array containing all the specified values
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		/*
		 * Using the System.out.println() plus the math inside to subtract the first
		 * element from the last one in an array of any length
		 */
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		int[] ages2 = new int[] {7, 34, 9, 24, 5, 10, 89, 76, 12};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		//Using a for loop that says for each integer in ages do this... then store that value in average
		int averageAge = 0;
		for (int age : ages) {
			averageAge += age;
		}
		averageAge = averageAge / ages.length;
		System.out.println(averageAge);
		
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		/*
		 * Using an enhanced for loop like before to iterate through each element
		 * in names. Then using the String.length() method to find the length of each
		 * String in the names array
		 */
		int average2 = 0;
		for (String name : names) {
			average2 += name.length();
		}
		average2 = average2 / names.length;
		System.out.println(average2);
		
		//Access the last element in an array with (array.length - 1)
		//Use the -1 because array index's start at 0 for their index not 1
		System.out.println(names[names.length - 1]);
		
		//Access the first element of an array using the index of 0
		System.out.println(names[0]);
		
		int[] nameLengths = new int[6];
		for (int i = 0; i < names.length; i++) {
			//Uses i as the index value to add the length of the string in names to nameLengths
			nameLengths[i] = names[i].length();
		}
		//since the enhanced for loop pulls each element on its own I can just add that number to the sum variable
		int sum = 0;
		for (int number : nameLengths) {
			sum += number;
		}
		System.out.println(sum);
		
		
		
		//Testing averageMaker method
		double[] doubArray = new double[] {1, 2, 24, 55, 12, 6, 24};
		System.out.println(averageMaker(doubArray));
		
		//Testing sentenceMaker method
		List<String> newList = new ArrayList<String>();
		newList.add("Hello");
		newList.add("My");
		newList.add("Name");
		newList.add("Is");
		newList.add("Ben");
		
		System.out.println(sentenceMaker(newList));
		
	}
	
	//Method that returns a String and intakes a String and an integer
	public static String concatString (String word, int n) {
		//New variable to hold the resulting concatenated string
		String result = "";
		//Iterates for n amount of times and concatenates the input word to result
		for (int i = 0; i < n; i++) {
			result += word;
		}
		//Have to return something because this method returns a String
		return result;
	}
	
	//Method returns a String that is the concatenated String of firstName and lastName
	public static String fullNameCreator (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	//Method returns a boolean value that shows if the sum of all the elements of an array add up to be greater than 100
	public static boolean isGreaterThan100(int[] numArray) {
		int sum = 0;
		for (int num : numArray) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	//Method will return a double of the average of all the elements in an input array
	public static double averageMaker(double[] numbers) {
		double average = 0;
		for (double number : numbers) {
			average += number;
		}
		average = average / numbers.length;
		return average;
	}
	
	/*
	 * Method intakes two double[] and puts out a boolean value
	 * Method returns true if the average of the first array is larger than the average of the second array, and false otherwise
	 */
	public static boolean isBiggerAverage(double[] array1, double[] array2) {
		double average1 = 0;
		double average2 = 0;
		for (double number : array1) {
			average1 += number;
		}
		average1 = average1 / array1.length;
		for (double number : array2) {
			average2 += number;
		}
		average2 = average2 / array2.length;
		if(average1 > average2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//Uses the operation && to show that isHotOutside needs to be true AND moneyInPocket has to be greater than 10.50
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * This method would be used when you need to concatenate a list
	 * of Strings together to create a sentence.
	 */
	public static StringBuilder sentenceMaker(List<String> strList) {
		//Start with an empty String
		StringBuilder sentence = new StringBuilder();
		//Iterate over the incoming list of Strings and add that to the sentence variable followed by a space
		for (String string : strList) {
			sentence.append(string + " ");
		}
		//Finally return the resulting sentence
		return sentence;
	}
	
}
