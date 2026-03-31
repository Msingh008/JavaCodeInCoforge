package org.example;

import java.util.HashMap;
import java.util.Set;

public class DifferencebetweenHighestLowest {
    public static void main(String[] args) {
        int[] nums={9,2,3,-1,4,6,8,9};
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }
            HashMap<String,Integer> mp=new HashMap<>();
            Set<String> keys=mp.keySet();


            if(nums[i]<smallest){
                secondSmallest=smallest;
                smallest=nums[i];
            }

        }
        int diff=secondLargest-secondSmallest;
        System.out.println(diff);
        System.out.println("2nd large"+secondLargest);
        System.out.println("2nd smallest"+secondSmallest);
        System.out.println("Smallest : "+smallest);
    }
}
