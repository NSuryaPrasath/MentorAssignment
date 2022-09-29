//Write a Java Program to iterate HashMap using While and advance for loop.
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
class HashMapIteration
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    HashMap<Integer,String> hs=new HashMap<Integer,String>(len);
    for(int i=0;i<len;i++)
    {
      System.out.println("Enter Number and Word");
      hs.put(sc.nextInt(), sc.next());
    }
    System.out.println("Printed using advance for loop");
    for(HashMap.Entry<Integer,String> value: hs.entrySet())
    {
      System.out.println(value.getKey()+" "+value.getValue());
    }
    Iterator<Entry<Integer,String>> iterate=hs.entrySet().iterator();
    System.out.println("Printed using while loop");
    while(iterate.hasNext())
    {
      Entry<Integer,String> data=iterate.next();
      System.out.println(data.getKey()+" "+data.getValue());
    }
  }
}