//Write a Java Program to find whether a string or number is palindrome or not.
import java.util.Scanner;
class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String line=sc.nextLine();
    boolean flag=true;
    line=line.replaceAll("\\p{Punct}","");
    int len=line.length();
    for(int i=0;i<len;i++)
    {
	if(line.charAt(i)!=line.charAt(len-1-i))
	{
	    flag=false;
	    break;
	}
    }
    if(flag)
    {
	System.out.println("String is a palindrome");
    }
    else
    {
	System.out.println("String is not a palindrome");
    }
  }

}