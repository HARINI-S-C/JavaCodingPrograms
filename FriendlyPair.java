/******************************************************************************
Check Whether or Not the Two Numbers are a Friendly Pair in Java Language
Given two integer as the numbers, the objective is to check whether the ratio of the sum of the factors of a number except the number itself upon the number, for both numbers, matches or not using Java Language. 
To do so we’ll firstly find all the factors of the two numbers given as the input. Then we divide the sum with the numbers to get the ratio. Now we’ll compare both the ratios. 
For any pair of numbers to be a Friendly Pair, the ratio must match. 


1.Output

30
140
Friendly Pair


2.Output

18
26
Not a Friendly Pair

*******************************************************************************/
import java.util.*;
class Amicable{
    static int findsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
public class FriendlyPair
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int s1=Amicable.findsum(n1);
		int s2=Amicable.findsum(n2);
		int r1=s1/n1;
		int r2=s2/n2;
		if(r1==r2){
		    System.out.println("Friendly Pair.");
		}
		else{
		    System.out.println("Not a Friendly Pair.");
		}
	}
}
