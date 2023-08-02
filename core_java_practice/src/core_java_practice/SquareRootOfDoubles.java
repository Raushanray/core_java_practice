package core_java_practice;
/*
 * Write a Corejava program that takes a list of doubles as input and calculate 
 * the square root of each double value. Then, return the list of square roots as a new list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareRootOfDoubles {
	public static void main(String[] args) {
		List<Double> numbers = Arrays.asList(4.0, 9.0, 16.0, 25.0);
		
		List<Double> squareRoots = new ArrayList<>();
		for (Double num : numbers) {
//			double squareRoot = Math.sqrt(num); 
			squareRoots.add(Math.sqrt(num));
		}
		System.out.println("Square roots of doubles: " + squareRoots);
	}

}


//output ->  Square roots of doubles: [2.0, 3.0, 4.0, 5.0]