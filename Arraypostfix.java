import java.util.*;
public class Arraypostfix{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int temp[]=new int[n];
        int sum=0;
        for(int i=n-1;i>=0;i++){
            sum+=arr[i];
            temp[i]=sum;
            i++;
        }
        System.out.println(Arrays.toString(temp));
    }
} 