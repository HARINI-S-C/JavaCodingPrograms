/*Take two integers as input denoting two large integers and print their sum using BigIntegers.
The Inputs:
34
20

The Output:
54
*/



import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class SumOfBigInteger
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger A,B,C;
		A=s.nextBigInteger();
		B=s.nextBigInteger();
		C=A.add(B);
		System.out.println(C);
	}
}
