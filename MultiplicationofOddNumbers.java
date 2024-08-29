/******************************************************************************

Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25


*******************************************************************************/
import java.util.*;
public class MultiplicationofOddNumbers
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		System.out.println("The odd numbers are :");
		for(int i=1;i<=n;i++){
		    System.out.println(2*i-1);
		    sum+=2*i-1;
		}
		System.out.println("The sum of odd Natural Number upto "+n+" terms is:"+sum);
	}
}
