//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
	public static void main(String []args) throws FileNotFoundException
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		System.out.println("Enter the length ");
		int len=scan.nextInt();
		System.out.println("Enter "+len+" value");
		for(int i=0;i<len;i++)
		{
			arraylist.add(scan.nextInt());
		}
		System.out.println("Using 'for' Loop");
		for(int i=0;i<len;i++)
		{
			System.out.print(arraylist.get(i)+" ");
		}
		System.out.println("\nUsing 'while' loop");
		int i=0;
		while(i<len)
		{
			System.out.print(arraylist.get(i++)+" ");
		}
		System.out.println("\nusing 'for each' loop");
		for(int value: arraylist)
		{
			System.out.print(value+" ");
		}
	} 
}

