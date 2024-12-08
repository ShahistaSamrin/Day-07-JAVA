/*  [11,13,16,20,23]  */
import java.util.*;
public class Arrayprefix{
    public static void main(String args[]){
        int a[]={11,2,3,4,5};
        int pre[]=new int[a.length];
        pre[0]=a[0];
        for(int i=0;i<a.length;i++)
        pre[i]=pre[i-1]+a[i];
        System.out.println(Arrays.toString(pre));
    }
}