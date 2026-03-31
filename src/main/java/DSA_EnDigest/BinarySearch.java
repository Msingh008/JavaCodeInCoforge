package DSA_EnDigest;

import java.util.Arrays;

public class BinarySearch {
    public static int returnIndexOfNum(int [] arr,int number){
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while (l<r){
            mid=l+r/2;
            if(arr[mid]==number){
                return mid;
            }
            else if(arr[mid]>number){
                r=mid-1;
            }else {
                l=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result=returnIndexOfNum(new int []{2,4,2,6,3,6,4,4,4,4,4},4);
        System.out.println(result);
    }
}
