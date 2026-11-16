/*SecondLargest Distinct Element of non duplicate*/

import java.util.*;

public class second {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int key : arr) {
            if(key>max){
                second=max;
                max=key;
            }
            else if(key>second && key<max){
                second=key;
            }

        }
        if(second==Integer.MIN_VALUE)System.out.print("NONE");
        else System.out.print(second);

    }
}
