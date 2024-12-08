/*  [1, 1, 2, 2, 2]  */
import java.util.*;
public class Arrays{ 
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 3};
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
            int res = s / (i + 1);
            a[i] = res;
        }
        System.out.println(Arrays.toString(a));  
    }
}