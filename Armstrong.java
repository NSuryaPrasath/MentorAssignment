//Write a Java Program to check Armstrong number.
import java.io.*;
import java.util.Scanner;
public class Armstrong {
	public static void main(String []args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number=sc.nextInt();
		int value=number,result=0;
		while(value>0)
		{
			int remainder=value%10;
			result+=Math.pow(remainder, 3);
			value/=10;
		}
		if(result==number)
		{
			System.out.println(number+" is a Armstrong Number");
		}
		else
		{
			System.out.println(number+" is not a Armstrong Number");
		}
	} 
}

