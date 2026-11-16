/*SecondLargest Distinct Element of non duplicate*/

import java.util.*;

public class secondLargest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (Integer key : mp.keySet()) {
            if(mp.get(key)==1){
                if(key>max){
                    second=max;
                    max=key;
                }
                else if(key>second && key<max){
                    second=key;
                }
            }
        }
        System.out.print(second);

    }
}
