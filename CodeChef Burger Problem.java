/******************************************************************************

Chef is fond of burgers and decided to make as many burgers as possible.

Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.Find the maximum number of burgers that Chef can make.

Input Format

The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers A and B, the number of patties and buns respectively.

Output Format

For each test case, output the maximum number of burgers that Chef can make.

Input

4
2 2
2 3
3 2
23 17

Output 

2
2
2
17

*******************************************************************************/
/* package codechef; // don't place package name! */

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
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(makeBurger(x, y));
	}
	}
	
	public static int makeBurger(int x, int y) {
		if(x<=y)
		return x;
		else
			return y;
		
	}

}
