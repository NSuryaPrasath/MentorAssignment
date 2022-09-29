//Write a Java Program to Intersect Two Arrays
import java.io.*;
import java.util.Scanner;
public class Intersect
{
	public static void insertArray(int[] arr,int l,Scanner sc)
	{
		for(int i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void intersect(int[] arr1,int[] arr2)
	{
		int l1=arr1.length,l2=arr2.length;
		if(l1>l2)
		{
			for(int i=0;i<l1;i++)
			{
				for(int j=0;j<l2;j++)
				{
					if(arr1[i]==arr2[j])
					{
						System.out.print(arr1[i]+" ");
					}
				}
			}
		}
		else
		{
			for(int i=0;i<l2;i++)
			{
				for(int j=0;j<l1;j++)
				{
					if(arr2[i]==arr1[j])
					{
						System.out.print(arr2[i]+" ");
					}
				}
			}
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length for Array 1 and Array 2 ");
		int len1=sc.nextInt();
		int len2=sc.nextInt();
		int Array1[]=new int[len1];
		int Array2[]=new int[len2];
		System.out.println("Enter "+len1+" Element for Array 1");
		insertArray(Array1,len1,sc);
		System.out.println("Enter "+len2+" Element for Array 2");
		insertArray(Array2,len2,sc);
		System.out.println("Intersect Array Values are ");
		intersect(Array1,Array2);
	} 
}

