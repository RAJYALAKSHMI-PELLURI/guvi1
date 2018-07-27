import java.util.Scanner;
class checkevenodd
{
  public static void main(String args[]) throws java.lang.Exception
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    if(n<0)
    {
      System.out.println("invalid");
    }
    else if(n%2==0)
    {
      System.out.println("Even");
    }
    else
    {
      System.out.println("Odd");
     }
   }
}
