package org.futurence;

import java.util.Scanner;

public class JaVa {
	
	// input java and output JaVa

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			String str = input.nextLine();
			System.out.println("input of string is ::::::"+str);

		    StringBuilder sb = new StringBuilder();
		    System.out.println("sb is "+sb);
		    for (int i = 0; i < str.length(); i++) {
		      if (i % 2 == 0) {
		        sb.append(Character.toUpperCase(str.charAt(i)));
		      } else {
		        sb.append(Character.toLowerCase(str.charAt(i)));
		      }
		    }

		    System.out.println("output "+sb.toString());
		}
	}

}
