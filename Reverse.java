//Write a Java Program to reverse a number
import java.io.*;
import java.util.Scanner;
public class Reverse {
	public static void main(String []args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt(),reverse=0;
		int value=number;
		while(value>0)
		{
			int remainder=value%10;
			reverse=reverse*10+remainder;
			value/=10;
		}
		System.out.println("Reverse Number = "+reverse);
	} 
}

