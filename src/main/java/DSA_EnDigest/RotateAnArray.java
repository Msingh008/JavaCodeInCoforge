package DSA_EnDigest;

import java.util.Arrays;

public class RotateAnArray {
    private static void reverseArray(int [] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    public static void rotateArraybyGivenIndex(int []arr,int number){
         reverseArray(arr,0,number-1);
         reverseArray(arr,number,arr.length-1);
         reverseArray(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int [] number={2,4,6,3,7,7,9};
        rotateArraybyGivenIndex(number,2);
        System.out.println(Arrays.toString(number));
    }
}
