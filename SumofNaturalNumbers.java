/******************************************************************************

Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:                                                                    
3                                                                               
The first n natural numbers are :                                                
1 2 3                                                                               
The Sum of Natural Number upto n terms :                                         
6

*******************************************************************************/
import java.util.*;
public class SumofNaturalNumbers
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("The first "+n+" natural numbers are:");
		for(int i=1;i<=n;i++){
		    System.out.print(i+" ");
		}
		for(int i=0;i<=n;i++){
		    sum=sum+i;
		}
		System.out.println();
		System.out.println("The sum of "+n+" natural number is "+sum);
	}
}
