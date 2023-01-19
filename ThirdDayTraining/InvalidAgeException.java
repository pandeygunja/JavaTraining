package com.firstdayjava;
import java.util.*;
public class InvalidAgeException extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		try {
			if(age<19) {
				throw new InvalidAgeException();
			}
		}
		catch(InvalidAgeException e) {
			System.out.println("Age not appropiate");
		}
		finally {
			System.out.println("My age is"+age);
		}
	}

}
