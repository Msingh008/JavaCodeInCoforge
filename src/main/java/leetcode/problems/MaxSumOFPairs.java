package leetcode.problems;

public class MaxSumOFPairs {
    public static int getSumeOfDigits(int num){
        int sum=0;
        while (num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static int returnMaxSum(int []nums){
        int maxSum=0;
        for(int i:nums){
            for(int  j:nums){
                if(i==j){
                    continue;
                }else if(getSumeOfDigits(i)==getSumeOfDigits(j)){
                    if(maxSum<i+j){
                        maxSum=i+j;
                    }
                }
            }
        }
        if(maxSum==0){
            return -1;
        }else
        return maxSum;
    }

    public static void main(String[] args) {
        int output = returnMaxSum(new int[]{4,6,10,6});
        System.out.println(output);
        System.out.println(getSumeOfDigits(6));
        System.out.println((float)16%10);
    }
}
