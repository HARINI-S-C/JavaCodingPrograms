/******************************************************************************

Input Format

First line will contain T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers X,Y, and A as mentioned in the statement.
Output Format

For each test case, output YES if Chef is eligible to give the exam, NO otherwise.

Input

5
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28

Output 

YES
NO
YES
NO
YES

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int i,T,x,y,a;
		T = sc.nextInt();
		for(i=0;i<T;i++){
		    x = sc.nextInt();
		    y = sc.nextInt();
		    a = sc.nextInt();
		    if(a>=x && a<y)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
