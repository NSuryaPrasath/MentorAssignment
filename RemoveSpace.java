//Write a Java Program to remove all white spaces from a string without using replace()
import java.io.*;
import java.util.Scanner;

public class RemoveSpace
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String line=sc.nextLine();
		String arrstr[]=line.split(" "),result="";
		for(String word: arrstr)
		{
			result+=word;
		}
		System.out.println(result);
	} 
}

