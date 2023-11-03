/******************************************************************************

Java Program to check a character is a Vowel or Consonant.

Input1:
d

Output:
Consonant

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char d=s.next().charAt(0);
		if(d=='A' || d=='E' || d=='I' || d=='O' || d=='U' || d=='a' || d=='e' || d=='i' || d=='o' || d=='u'){
		    System.out.println("Vowel");
		}
		else{
		    System.out.println("Consonant");
		}
	}
}
