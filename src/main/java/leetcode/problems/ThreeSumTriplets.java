package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class ThreeSumTriplets {
    public static  List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> triplet=null;
        List<List<Integer>> triplets=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
           int j=i+1;
          int k=nums.length-1;
           while (j<k){
           if(nums[i]+nums[j]+nums[k]>0){
               k--;
           }else if(nums[i]+nums[j]+nums[k]<0){
               j++;
           }else if(nums[i]+nums[j]+nums[k]==0){
               triplet=new ArrayList<>();
               triplet.add(nums[i]);
               triplet.add(nums[j]);
               triplet.add(nums[k]);
               if(!triplets.contains(triplet)){
               triplets.add(triplet);}
               while (nums[j]==nums[j+1] && j<k){
                   j++;
               }
               }

           }
        }

        return triplets;
        }


    public static void main(String[] args) {
        System.out.println(threeSum(new int []{-1,0,1,2,-1,-4}));
    }
}
