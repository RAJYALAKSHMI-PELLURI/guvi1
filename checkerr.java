import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class checker1
{
	public static void main (String[] args)  throws java.lang.Exception
	{
		
      int num;	
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter a number: ");
      num = sc.nextInt();
      if(num>0) 
      {
       System.out.println("Number is positive.");
      }
      else if(num<0)
      {
        System.out.println("Number is negative.");
      }
      else
      {
        System.out.println("Number is zero.");
      }
  	}
}
