/******************************************************************************

Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant

*******************************************************************************/
import java.util.*;
public class VowelorConsonant
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch=sc.next().toLowerCase();
		boolean uppercase=ch.charAt(0)>=65 && ch.charAt(0)<=90;
		boolean lowercase=ch.charAt(0)>=97 && ch.charAt(0)<=122;
		boolean vowels=ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u");
		if(ch.length()>1 || ch.length()<1){
		    System.out.println("Error, Enter a single character");
		}
		else if(ch.length()==1){
		    if(!(lowercase || uppercase)){
		        System.out.println("Error, Enter a alphabet");
		    }
		    else{
		        if(vowels){
		            System.out.println("Vowel");
		        }
		        else{
		            System.out.println("Consonant");
		        }
		    }
		}
	}
}
