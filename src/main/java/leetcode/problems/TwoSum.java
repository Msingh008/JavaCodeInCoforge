    package leetcode.problems;

    import java.util.HashMap;

    public class TwoSum {
        public static int getSumeOfDigits(int num){
            int sum=0;
            while (num>0){
                sum+=num%10;
                num/=10;
            }
            return sum;
        }
        public int maximumSum(int[] nums) {
            HashMap<Integer,Integer> sum=new HashMap<>();
            int tempMax=0;
            for(int i:nums){
                if(sum.containsKey(getSumeOfDigits(i))){

                    if(tempMax<sum.get(getSumeOfDigits(i))+i) {
                        tempMax = sum.get(getSumeOfDigits(i)) + i;
                    }
                    if(sum.get(getSumeOfDigits(i))<i){
                        sum.put(getSumeOfDigits(i),i);
                    }
                }else sum.put(getSumeOfDigits(i),i);
            }
            if(tempMax==0){
                return -1;
            }else
            return tempMax;
    }

        public static void main(String[] args) {
            TwoSum t=new TwoSum();
            System.out.println(t.maximumSum(new int []{18,43,36,13,7}));
        }
    }
