//Write a Java Program to find whether a number is prime or not.
import java.util.Scanner;
class PrimeOrNot
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     boolean flag=false;
     if(num>0)
     {
	for(int i=2;i<=num/2;i++)
	{
	  if(num%i==0)
	  {
	     flag=true;
	     break;
	   }
	 }
	 if(flag)
	 {
	   System.out.println(num+" is not a prime number");
         }
	 else
	 {
	   System.out.println(num+" is a prime number");
	  }
     }
  }
}