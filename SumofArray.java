/******************************************************************************
Sum of the Elements of the array using Java
Here, in this page we will discuss the program to find the Sum of the elements of the array using java. 
We are given with an array and we need to print the Sum of the elements among the given elements of the array.


Output:
3
6
8
2

Sum: 16
*******************************************************************************/
import java.util.*;
public class SumofArray
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
		
		    sum=sum+arr[i];
		}
		System.out.println();
		System.out.println("Sum: "+sum);
		
	}
}
