package Exam;

import java.util.Scanner;

public class Operators {
	 public static void main(String args[])
	    {
		 Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the expression: ");
	    	String s=sc.nextLine();
	   
	    	 if (s == null || s.isEmpty())
	    	 {
	    		 System.out.println("wrong input");
	    	 }
	         int length = s.length();
	         int currentNumber = 0, lastNumber = 0, result = 0;
	         char operation = '+';
	         for (int i = 0; i < length; i++) {
	             char currentChar = s.charAt(i);
	            // System.out.println(currentChar);
	             if (Character.isDigit(currentChar)) {
	                 currentNumber = (currentNumber * 10) + (currentChar - '0');
	             }
	             if (!Character.isDigit(currentChar) || i == length - 1) {
	             	//System.out.println(operation+" c  "+currentNumber+" l "+lastNumber);
	                 if (operation == '+' || operation == '-') {
	                     result += lastNumber;
	                     lastNumber = (operation == '+') ? currentNumber : -currentNumber;
	                 } else if (operation == '*') {
	                     lastNumber = lastNumber * currentNumber;
	                 } else if (operation == '/') {
	                     lastNumber = lastNumber / currentNumber;
	                 }
	                 operation = currentChar;
	                 currentNumber = 0;
	                 //System.out.println(lastNumber);
	             }
	         }
	         result += lastNumber;

	       
	      System.out.println(result);
	    }
	   
	}


