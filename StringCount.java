//Write a Java Program to count the number of words in a string using HashMap.
import java.util.Scanner;
import java.util.HashMap;
class StringCount
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine();
    String[] words = string.split(" ");
    HashMap<String,Integer> hs=new HashMap<String,Integer>();
    int count=0;
    for(String word : words)
    {
	hs.put(word, ++count);
    }
    System.out.println("Total Words in a string is "+count);
  }
}