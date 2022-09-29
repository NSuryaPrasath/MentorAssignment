//Write a Java Program to find first 5 Fibonacci series which are also prime. 
class FibonacciPrime
{
  public static void main(String args[])
  {
    int a=0,b=1;
    boolean flag=true;
    System.out.println("Fibonacci which are also prime for first 5 value");
    for(int i=0;i<9;i++)
      {
         int c=a+b;
         if(c>0)
         {
            for(int j=2;j<=c/2;j++)
            {
               if(c%j==0)
               {
                 flag=false;
                 break;
               }
	       flag=true;
            }
            if(flag)
	    {
	      System.out.println(c);
            }
         }
         a=b;
         b=c;
      }
  }
}