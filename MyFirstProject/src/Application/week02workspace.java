(package Application;

import java.util.Scanner;

public class week02workspace {

	/**
	 * booleans
	 */
	public static void main(String[] args) {
//		// ==equality operator
//		System.out.println(2==2);
//		System.out.println(2 > 5);
//		System.out.println(3 <= 5);
//		System.out.println(5<=5);
//		//&& and || or
//		System.out.println(2 == 2 && 1 < 5);
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(true || false);
//		System.out.println(false || false);
//		System.out.println(2 == 2 || 1 == 5);
//		System.out.println(2 == 2 && 1 == 5);
//		/**
//		 * Conditionals
//		 */
//		
//		String name = "sam";
//		if (name == "sam") {
//			System.out.println("Hello Sam!");
//		} else {
//			System.out.println("You are not Sam, " + name);
//		}
//
//		int age = 15;
//		
//		if (age >=16) { 
//			System.out.println("You can get your license");
//		} else {
//			//System.out.println("Please wait until you are 16 years old");
//			System.out.println("Please wait " + (16 - age) + " year(s) to get your license");
//		}
//		
//		double costOfMilk = 4;
//		
//		if (costOfMilk <= 2) {
//			System.out.println("Buying 2");
//		} else if (costOfMilk <=3) {
//			System.out.println("Buying 1");
//		} else {
//			System.out.println("Not buying any milk");
//		}
//		
//		char grade = 'A';
//		
//		switch (grade) {
//			case 'A':
//				System.out.println("90%");
//				break;
//			case 'B':
//				System.out.println("80%");
//				break;
//			default:
//				System.out.println("0%");
//				//if you want multiple things to occur, omit the break, if once something has been met you want it executed include break
//			}
//		
//			if (5 == 5) { 
//				if (4 == 3) {
//					System.out.println("Yes");
//				
//				} else {
//					System.out.println("No");
//				}
//			}
//			
//			
//			//loops!
//			//for loops contain 3 pieces to initialize (declare variable; condition, boolean condition; post iteration/increment   )
//			
////			for (int i = 0; i < 10; i ++) {
////				System.out.println("Scoop cup of flour");
////				
////			}
////			
////			for (int i = 1; 1 <= 10; i++) {
////				System.out.println(i);
////			}
//			
////			for (int i = 0; i < 100; i += 2) {
////				System.out.println(i);
////			}
////			
//			for (int i = 0; i < 100; i ++) {
//				if (i % 2 == 0)
//					System.out.println(i);
//			}
//			
//			// while loops are better if you are unaware of how many iterations there are to work through
//			
//			int x = 0;
//			while (x < 10) {
//				System.out.println(x); //<this is an infinite loop because the condition will never be stiated.
//				x++;
//			}
//			// do while always runs once, it executes and then sees if the condition was met, while loops only execute if the condition is met
//			
//			do {	
//				System.out.println(x);
//				x++;
//			} while (x < 2);
			
			//enhanced for loop, performs an iteration for each item in a collection,like list or array. Each is an enhanced for loop
			
			//user input can create an object called a scanner
			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("Enter your name: ");
//			String name1 = sc.nextLine();
//			
//			System.out.println("Welcome, " + name1);
//			int selection = 0;
//			double total = 0;
//
//			while (selection !=4) {
//			System.out.println("Select an option.");
//			System.out.println("1) add candybar to shopping cart: 1.99");
//			System.out.println("2) add cheese to shopping cart: 6.95");
//			System.out.println("3) add soccer ball to shopping cart: 12.99");
//			System.out.println("4) check out");
//			selection = sc.nextInt();
//				
//			switch (selection) {
//				case 1:
//					total += 1.99;
//					break;
//				case 2:
//					total += 6.95;
//					break;
//				case 3:
//					total +=12.99;
//					break;
//				case 4:
//					break;
//				default:
//					System.out.println("Please pick a valid option.");
//			}
//			
//			System.out.println("Your current total is: " + total);
//		
//		
//	
//}
			for (int i = 0; i < 10; i--) {

				  System.out.println(i);

				}
}
	
	
}