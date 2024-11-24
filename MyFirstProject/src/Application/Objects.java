package Application;

import java.util.Scanner;

public class Objects {
	public static void main(String[] args) {
		
		int age = 34; //<primitive data type
		
		String name = "Sally Mae"; //<object, has properties and methods
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		
		Scanner s = new Scanner(System.in);
		
		
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);
	}

}
