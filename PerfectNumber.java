/******************************************************************************
Check Whether or Not the Number is an Perfect Number in Java Language
Given an integer input as the number, the objective is to check whether or not the number can be represented as the sum of its factors except the number itself. 
Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.

1.Output

5
Not an Perfect Number.

2.Output

6
Perfect Number.

*******************************************************************************/
import java.util.*;
class Perfect{
    static boolean find(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
}
}
public class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean res=Perfect.find(n);
		if(res==true)
		{
		    System.out.println("Perfect Number.");
		}
		else
		{
		    System.out.println("Not a Perfect Number.");
		}
	}
}
