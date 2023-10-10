/******************************************************************************
Smallest Element of the array using Java
Here, in this page we will discuss the program to find the Smallest element of the array using java. 
We are given with an array and we need to print the Smallest element among the given elements of the array.


Output:
3
6
8
2

2
*******************************************************************************/
import java.util.*;
public class SmallestinArray
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<n;i++){
		    if(arr[i]<min){
		        min=arr[i];
		    }
		}
		System.out.println();
		System.out.println(min);
	}
}
