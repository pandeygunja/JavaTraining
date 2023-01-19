package com.firstdayjava;

public class Child  extends Parent{
int c=30;
public Child(int c)
{
	super(200);
	this.c=c;
	System.out.println("In child parameterized constructor");
}
public Child()
{
	System.out.println("In child no parameterized constructor");
}
public void show()
{
	System.out.println("in child class");
}
public void add()
{
	int sum =p+c;
	System.out.println(sum);
	
}

}
