//Write a Java Program to reverse a string without using String inbuilt function reverse()
import java.util.Scanner;
class StringReverse2
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     String line=sc.nextLine();
     for(int i=line.length()-1;i>=0;i--)
     {
        System.out.print(line.charAt(i));
     }
  }
}