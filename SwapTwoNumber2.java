//Write a Java Program to swap two numbers without using the third variable.
import java.util.Scanner;
class SwapTwoNumber2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int var1=sc.nextInt();
    int var2=sc.nextInt();
    System.out.println("Before Swapping Values : "+var1+" "+var2);
    var1=var1+var2;
    var2=var1-var2;
    var1=var1-var2;
    System.out.println("After Swapping Values using + and - operator : "+var1+" "+var2);
    var1=var1^var2;
    var2=var1^var2;
    var1=var1^var2;
    System.out.println("After Swapping Values using ^ operator : "+var1+" "+var2);
  }
}