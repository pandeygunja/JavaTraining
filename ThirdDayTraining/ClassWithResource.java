package com.firstdayjava;
import java.io.*;
public class ClassWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(
			
			FileOutputStream fos = new FileOutputStream("abc.txt"))
				{
					
					String s = "Hi";
					byte arr[]=s.getBytes();
					fos.write(arr);
					
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Resource is used and closed");

	}

}
