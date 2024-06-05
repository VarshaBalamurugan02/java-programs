package javaprogram;

public class squarehollowprogram2 {

	import java.util.Scanner;

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the side length of the square: ");
	        int sideLength = scanner.nextInt();

	       
	        for (int i = 0; i < sideLength; i++) {
	            System.out.print("* ");
	        }
	        System.out.println();

	      
	        for (int i = 0; i < sideLength - 2; i++) {
	            System.out.print("* ");
	            for (int j = 0; j < sideLength - 2; j++) {
	                System.out.print("  "); 
	            }
	            System.out.println("* ");
	        }

	        
	        for (int i = 0; i < sideLength; i++) {
	            System.out.print("* ");
	        }
	    }
	}
