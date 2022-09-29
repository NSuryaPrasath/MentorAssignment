//Write a Java Program to find the second-highest number in an array.
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class SecondHighest {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter "+len+" element");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		System.out.println("Second Highest Number in an array is "+arr[len-2]);
	} 
}