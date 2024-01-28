/*

Program to find whether the given number is strong or Not

Input:
143

Output:
Strong Number


*/import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Strong ss=new Strong();
        boolean res=ss.detectStrong(n);
        if(res==true){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}


class Strong{
    int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    boolean detectStrong(int num){
        int t=num;
        int sum=0;
        while(t!=0){
            int d=t%10;
            sum=sum+fact(d);
            t=t/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}