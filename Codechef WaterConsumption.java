﻿/******************************************************************************

Input Format

The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer X — the amount of water Chef drank today.

Output Format

For each test case, output YES if Chef followed the doctor's advice of drinking at least 2000 ml of water. Otherwise, output NO.
You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Input
3
2999
1450
2000

Output
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
		    if(a>=2000){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    i=i+1;
		}
	}
}