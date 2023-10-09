/******************************************************************************
Check Whether or Not the Number is an Harshad Number in Java Language
Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.

1.Output

18
Harshad Number.

2.Output

345
Not a Harshad Number.

*******************************************************************************/
import java.util.*;
class Harshad{
    static boolean find(int n){
        int original=n;
        int sum=0;
        int digit=0;
        while(n!=0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        if(original%sum==0){
            return true;
        }
        else{
            return false;
        }
    }
}
public class HarshadNumber
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean res=Harshad.find(n);
		if(res==true){
		    System.out.println("Harshad Number.");
		}
		else{
		    System.out.println("Not a Harshad Number.");
		}
	}
}
