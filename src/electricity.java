/*Q3. Electricity Bill Calculator – Easy
        Problem: Calculate a domestic electricity bill using slabs: first 100 units at ₹1.5/unit, next 100 at
        ₹2.5/unit, and units above 200 at ₹4/unit. Add a fixed charge of ₹50. Units are non-negative; print the
        bill with two decimal places.*/

import java.util.*;

public class electricity {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double price=0;
       if(n<=100){
           price = n*1.5;
       }
       else if(n<=200){
           price=100*1.5 +(n-100)*2.5;
       }
       else{
           price=100*1.5+100*2.5 +(n-200)*4;
       }
        System.out.print(price+50);
    }
}
