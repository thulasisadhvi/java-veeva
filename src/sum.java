/*Q1. Sum of Digits – Easy
Problem: Read an integer N and print the sum of its digits. Treat a negative number using its absolute
value.*/

import java.util.*;
public class sum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long N = sc.nextLong();
        N = Math.abs(N);
        int sum=0;
        while(N>0){
            long r= N%10;
            sum+=r;
            N=N/10;
        }
        System.out.println(sum);
    }
}
