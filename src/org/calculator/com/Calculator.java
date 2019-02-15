package org.calculator.com;

public class Calculator {
	public static void main(String args[])
	{

	Calculator obj=new Calculator();
	System.out.println(obj.add(5,6));
	System.out.println(obj.sub(7,5));
}

	public int add(int a,int b)
{
	return a+b;
}
	public int sub(int a,int b)
{
	return a-b;
	
}
}
