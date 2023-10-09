/******************************************************************************
Check Whether or Not the Number is an Abundant Number in Java Language
Given an integer input, the objective is to check whether or not the sum of all the factors of the number, except the number itself is greater than the number. For any number to be an Abundant Number, the sum of it’s factors except itself must be greater than the number. 
Therefore, we’ll first find all the factors of the number without the number itself within the range 1 to the number/2. We’ll keep summing the factors meanwhile and finally check with the actual number. 
If we Include the number itself as a factors then the sum must be divided by 2 before comparing.

1.Output

12
Abundant Number.

2.Output

15
Not a Abundant Number.

*******************************************************************************/
import java.util.*;
class Abu{
    static boolean find(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n<sum){
            return true;
        }
        else{
            return false;
        }
    }
}
public class AbundantNumber
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean res=Abu.find(n);
		if(res==true){
		    System.out.println("Abundant Number.");
		}
		else{
		    System.out.println("Not a Abundant Number.");
		}
	}
}
