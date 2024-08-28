/******************************************************************************

Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int year=sc.nextInt();
		String monthname="";
		int totaldays=0;
		switch(month){
		    case 1:
		        monthname="January";
		        totaldays=31;
		        break;
		    case 2:
		        monthname="February";
		        if((year%4==0 && year%100!=0)||(year%400==0)){
		            totaldays=29;
		        }
		        else{
		            totaldays=28;
		        }
		        break;
		    case 3:
		        monthname="March";
		        totaldays=31;
		        break;
		    case 4:
		        monthname="April";
		        totaldays=30;
		        break;
		    case 5:
		        monthname="May";
		        totaldays=31;
		        break;
		    case 6:
		        monthname="June";
		        totaldays=30;
		        break;
		    case 7:
		        monthname="July";
		        totaldays=31;
		        break;
		    case 8:
		        monthname="August";
		        totaldays=31;
		        break;
		    case 9:
		        monthname="September";
		        totaldays=30;
		        break;
		    case 10:
		        monthname="October";
		        totaldays=31;
		        break;
		    case 11:
		        monthname="November";
		        totaldays=30;
		        break;
		    case 12:
		        monthname="December";
		        totaldays=31;
		        break;
		    default:
		       System.out.println("Invalid month");
		       break;
		}
		if(month>=1 && month<=12){
		    System.out.println(monthname+"-"+year+" has "+totaldays+" number of days");
		}
	}
}
