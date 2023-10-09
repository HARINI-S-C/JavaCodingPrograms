/******************************************************************************
Check Whether or Not the Number is an Automorphic Number in Java Language
Given an integer input, the Objective is to check whether the square of the number ends with the same number or not. 
Therefore, we’ll write a code to Check Whether or Not the Number is an Automorphic Number in Java Language.
1.Output

10
Not an Automorphic Number.

2.Output

376
Automorphic Number.

*******************************************************************************/
import java.util.*;
class Automorphic{
    static boolean find(int n){
        int square=n*n;
        while(n!=0)
        {
           if(n%10!=square%10)
           {
             return false;
           }
           n=n/10;
           square=square/10;
            
        }
    return true;
}
}
public class AutomorphicNumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean res=Automorphic.find(n);
		if(res==true)
		{
		    System.out.println("Automorphic Number.");
		}
		else
		{
		    System.out.println("Not an Automorphic Number.");
		}
	}
}
