import java.util.*;

import java.lang.*;

import java.io.*;

class Checkleapyear1

{
	
   public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = no;
        if(year % 400 == 0)
        {
            flag = yes;
        }
        else if (year % 100 == 0)
        {
            flag = no;
        }
        else if(year % 4 == 0)
        {
            flag = yes;
        }
        else
        {
            flag = no;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}
