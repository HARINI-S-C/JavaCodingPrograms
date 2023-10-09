/******************************************************************************

The output:
 4
****
***
**
*

*******************************************************************************/
import java.util.*;
public class Pattern3
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int r=1;r<=n;r++){
		    for(int c=1;c<=n-r+1;c++){
		        System.out.print("* ");
		    }
		    System.out.println( );
		}
	}
}
