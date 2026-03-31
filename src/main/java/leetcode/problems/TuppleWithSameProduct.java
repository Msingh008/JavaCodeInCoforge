package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class TuppleWithSameProduct {
    public static  int tupleSameProduct(int[] nums) {
        int counter = 0;
        List<Integer> tupples=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(tupples.size()==4){
                System.out.println(tupples);
                if(tupples.get(0)*tupples.get(1)==tupples.get(2)*tupples.get(3)){
                    counter++;
                    tupples.clear();
                }else
                    tupples.clear();
            }else  tupples.add(nums[i]);
            for(int j=0;j<nums.length;j++){
                if(tupples.size()<4){
                    if(!tupples.contains(nums[j])){
                        tupples.add(nums[j]);
                    }
                }else{
                    System.out.println(tupples);
                    if(tupples.get(0)*tupples.get(1)==tupples.get(2)*tupples.get(3)){
                        counter++;
                        tupples.clear();
                    }else
                        tupples.clear();
                    }
                }

         }

        return counter;

    }

    public static void main(String[] args) {
        tupleSameProduct(new int []{2,3,4,6});
    }
}
