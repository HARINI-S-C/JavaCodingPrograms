/******************************************************************************

Java Program to find length of the string without using length function

Input:
Hello

Output:
5
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int length=0;
	    for(char c: n.toCharArray()){
	        length++;
	    }
		System.out.println(length);
	}
}
