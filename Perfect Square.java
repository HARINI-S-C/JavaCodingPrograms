/*
Check if the given number if perfect number or Not

Input:
25

Output:
Perfect Square

*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean res=Solution.perfect(n);
        if(res==true){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
    }
}

class Solution{
    static boolean perfect(int n){
        if(n>=0){
            int sq=(int)Math.sqrt(n);
            return ((sq*sq)==n);
        }
        return false;
    }
}