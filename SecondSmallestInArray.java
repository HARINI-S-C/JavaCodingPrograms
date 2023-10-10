/*Write a java program to find the second largest element in the array.

Output:
4
3
8
5
6

Second Smallest: 5

*/
import java.util.*;
class SecondSmallestInArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sm=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<sm){
                sm=arr[i];
            }
        }
        int ssm=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=sm && arr[i]<ssm){
                ssm=arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("Second smallest: "+ssm);
    }
}
