/******************************************************************************

Bubble Sort is a simple sorting algorithm commonly used to sort elements in a list or array. 
It works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order. 
The algorithm iterates through the list multiple times until no more swaps are needed, resulting in a sorted sequence.


O/P:
Before sorting:
3 6 1 8 4
3 1 6 4 8
1 3 4 6 8
1 3 4 6 8
1 3 4 6 8
1 3 4 6 8
After sorting:
1 3 4 6 8
*******************************************************************************/
import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
		int[] numbers={3,6,1,8,4};
		int size=numbers.length;
		int temp;
		System.out.println("Before sorting:");
		for(int num:numbers){
		    System.out.print(num+" ");
		}
		for(int i=0;i<size;i++){
		    for(int j=0;j<size-i-1;j++){
		        if(numbers[j]>numbers[j+1]){
		            temp=numbers[j];
		            numbers[j]=numbers[j+1];
		            numbers[j+1]=temp;
		        }
		    }
		    System.out.println();
		    for(int num:numbers){
		        //System.out.println();
		        System.out.print(num+" ");
		    }
		}
		System.out.println();
		System.out.println("After sorting:");
		for(int num:numbers)
		{
		System.out.print(num+" ");
		}
	}
}
