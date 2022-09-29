//Write a Java Program to find the duplicate characters in a string.
import java.io.*;
import java.util.Scanner;
public class DuplicateChar 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String line=sc.nextLine();
		int count;
		char word[]=line.toCharArray();
		System.out.print("Duplicate Character in a string = ");
		for(int i=0;i<line.length();i++)
		{
			count=1;
			for(int j=i+1;j<line.length();j++)
			{
				if(word[i]==word[j] && word[i]!=' ')
				{
					count++;
					word[j]='0';
				}
			}
			if(count>1 && word[i]!='0')
			{
				System.out.print(word[i]+" ");
			}
		}
	} 
}

