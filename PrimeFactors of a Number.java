/******************************************************************************

Program for Finding out the Prime Factors of a number in Java.

Input : 12
Output : 2 2 3

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<n;i++){
		    while(n%i==0){
		        System.out.print(i+" ");
		        n=n/i;
		    }
		}
		if(n>2){
		    System.out.print(n);
		}
	}
}
