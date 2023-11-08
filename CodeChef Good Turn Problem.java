/******************************************************************************

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case contains two space-separated integers X and Y — the numbers Chef and Chefina got on their respective dice.

Output Format
For each test case, output on a new line, YES, if the turn was good and NO otherwise.
Each character of the output may be printed in either uppercase or lowercase. 
That is, the strings NO, no, nO, and No will be treated as equivalent.

Input
4
1 4
3 4
4 2
2 6

Output
NO
YES
NO
YES

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int i=1;
		while(i<=t){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if(a+b>6){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    i=i+1;
		}
	}
}