import java.util.*;
class Alphabets
{
	public static void main (String[] args) throws java.lang.Exception
    {
        char alphabet;
        Scanner sc= new Scanner(System.in);
        alphabet=sc.next().charAt(0);
        if((alphabet>='a' && alphabet<='z') || (alphabet>='A' && alphabet<='Z'))
        {
            System.out.print(alphabet+"/nAlphabet");
        }
        else
        {
            System.out.print(alphabet+"/nNo");
        }
    }
}
