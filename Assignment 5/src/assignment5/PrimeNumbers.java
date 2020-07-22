package assignment5;

import java.util.ArrayList;
import java.util.Scanner;



public class PrimeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Start number: ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("End number: ");
		int end = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> list = new ArrayList<>();
		int x = start;
		boolean flag = false;
		
		while(x >= start && x <= end) {
				
			for(int i=2;i<x;i++) {	
			     
					if(x%i==0) {
			        	flag = true;
			        	break;
			        } 
			    }
				if(x <=1) {
					flag = true;
				}
				
				if(flag == false) {
					if(x != 1 && x != 0) {
						list.add(x);
					}
				}
				
				
				flag = false;
				x++;

	    }
		
		
		ArrayList<String> stringList = new ArrayList<>();
		int spaces;
		String ret = "";
		
		
		if(list.size() > 0) {
			String lastNum = list.get(list.size()-1).toString();
			for (Integer numb : list) {
				
				spaces = lastNum.length() - numb.toString().length();
				for (int i = 0; i < spaces; i++) {
					ret += " ";
				}
				
				ret += numb.toString();
				stringList.add(ret);
				ret = "";
			}
				
			int col =0;
			for(String newStr : stringList) {
				col++;
				System.out.print(newStr + " ");
				if(col ==10) {
					System.out.println();
					col =0;
				}
			}
		}
		sc.close();

		
	}
}

