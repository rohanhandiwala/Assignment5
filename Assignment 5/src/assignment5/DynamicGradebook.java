package assignment5;
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicGradebook {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
		int students = -1;
		while(students < 0) {
			System.out.print("How many students are in your class? ");
			students = Integer.parseInt(sc.nextLine());
			if(students < 0) {
				System.out.println("Invalid number of students, try again.");
				System.out.println();
			}
		}
		
		int tests = -1;
		while(tests < 0) {
			System.out.print("How many tests in this class? ");
			tests = Integer.parseInt(sc.nextLine());
			if(tests < 0) {
				System.out.println("Invalid # of tests, try again.");
				System.out.println();
			}
		}
		System.out.println("Here we go!");
		
		double avg = 0;
		double testTotal = 0;
		int x =1;
		ArrayList<Double> totalAverage = new ArrayList<>();
		
		
		for(int i =1; i <= students; i++) {
			System.out.println("**** Student #" + i + "****");
			
			
			while(x <= tests) {
				boolean bool = true;
				while(bool == true) {
					System.out.print("Enter score for test #" + x + ": ");
					double num = Double.parseDouble(sc.nextLine());
					
					
					if(num<0) {
						System.out.println("Invalid score, try again");
						bool = true;
						
					
					}else {
						testTotal += num;
						bool = false;
						totalAverage.add(num);
					}
				}
				x++;
			}
			
			avg = testTotal / tests;
			System.out.println("Average score for student #" + i + " is " + avg);
			System.out.println();
			
			
			testTotal = 0;
			x=1;
			

		}
		
		
		double totalAvgnum = 0;
		for(Double number : totalAverage) {
			totalAvgnum += number;
		}
		double finalAvg = totalAvgnum / totalAverage.size();
		System.out.print("Average score for all students is: " + finalAvg);

		sc.close();
		
	}

}
