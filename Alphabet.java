import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Alphabets
{
	public static void main (String[] args) throws java.lang.Exception
    {
        char alphabet;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Character : ");
        alphabet=sc.next().charAt(0);
        if((alphabet>='a' && alphabet<='z') || (alphabet>='A' && alphabet<='Z'))
        {
            System.out.print(alphabet+"Alphabet");
        }
        else
        {
            System.out.print(alphabet+"No");
        }
    }
}
