/*Q2. Prime Numbers in a Range – Moderate
Problem: Print all prime numbers between L and R, inclusive, in ascending order. If no prime exists,
print None. Constraints: 1 ≤ L ≤ R ≤ 100000.*/

import java.util.*;
public class prime {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        for(int i=L;i<=R;i++){
            if(ischeck(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean ischeck(int n){
        if(n<=1)return false;
        for (int i=2;i*i<=n;i++){
            //i*i can overflow better to use i<=n/i
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
