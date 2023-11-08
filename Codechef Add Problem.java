/******************************************************************************

Input Format
The first line contains an integer T, the total number of test cases.
Then follow T lines, each line contains two integers, A and B.

Output Format
For each test case, add A and B and display the sum in a new line.

Input
3
1 2
100 200
10 40

Output
3
300
50

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
		    System.out.println(a+b);
		    i=i+1;
		}
	}
}
