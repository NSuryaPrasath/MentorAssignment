//Write a Java Program to reverse a string without using String inbuilt function.
import java.util.Scanner;
class StringReverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String line=sc.nextLine();
    StringBuilder SB=new StringBuilder(line);
    line=SB.reverse().toString();
    System.out.println(line);
  }
}