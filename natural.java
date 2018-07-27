import java.util.*;
import java.lang.*;
import java.io.*;
class natural
{
	public static void main (String[] args) throws java.lang.Exception
	{
		   int number, i, sum = 0;
   Scanner sc = new Scanner(System.in);
   number = sc.nextInt();	
  for(i = 1; i <= number; i++)
  {
	sum = sum + i; 
   }	
   System.out.println(sum);
}
}
