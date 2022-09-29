//Write a Java Program to remove all white spaces from a string with using replace().
import java.io.*;
import java.util.Scanner;
public class RemoveWhiteSpaceReplace 
{
	public static void main(String []args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s=sc.nextLine();
		s=s.replace(" ", "");
		System.out.println(s);
	} 
}

