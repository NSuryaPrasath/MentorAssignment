//Write a Java Program to convert HashSet To Array
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class HashSetToArray 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length ");
		int len=sc.nextInt();
		HashSet<String> hs=new HashSet<String>(len);
		for(int i=0;i<len;i++)
		{
			hs.add(sc.next());
		}
		String array[]=new String[len];
		int index=0;
		System.out.println("Hash Set Elements"+hs);
		for(String element: hs)
		{
			array[index++]=element;
		}
		System.out.print("Array Elements ");
		for(int i=0;i<len;i++)
		{
			System.out.print(array[i]+" ");
		}
	} 
}

