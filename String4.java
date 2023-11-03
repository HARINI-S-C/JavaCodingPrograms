/******************************************************************************

Java Program to check a Character is a alphabet  or not.

Input1:
9

Output:
Not an Alphabet

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char d=s.next().charAt(0);
		if(d>='a' && d<='z' || d>='A' && d<='Z'){
		    System.out.println("Alphabet");
		}
		else{
		    System.out.println("Not an Alphabet");
		}
	}
}
