package com.firstdayjava;
import java.util.*;


public class MaximumThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int firstnum =sc.nextInt();
		int secondnum = sc.nextInt();
		int thirdnum = sc.nextInt();
		 if(firstnum>secondnum && firstnum>thirdnum)
		 {
			 System.out.println(firstnum);
		 }
		 
		 else if(secondnum>thirdnum)
		 {
			 System.out.println(secondnum);
		 }
		 else
		 {
			 System.out.println(thirdnum);
		 }
		 
		
		

	}

}
