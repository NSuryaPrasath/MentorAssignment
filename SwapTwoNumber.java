//Write a Java Program to swap two numbers using the third variable.
import java.util.Scanner;
class SwapTwoNumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int var1=sc.nextInt();
    int var2=sc.nextInt();
    System.out.println("Before Swapping Values : "+var1+" "+var2);
    int var3=var2;
    var2=var1;
    var1=var3;
    System.out.println("After Swapping Values : "+var1+" "+var2);
  }
}