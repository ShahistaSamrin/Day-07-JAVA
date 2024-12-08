/*   5
        *
      * *
    * * *
  * * * *
* * * * * 
*/import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1 || i+j==n-1 || i==n-1 || i+j==n || i+j==n+1){
                System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
         }
    }
}