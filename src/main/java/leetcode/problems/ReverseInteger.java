package leetcode.problems;

public class ReverseInteger {
    public int reverse(int x){

        int result=0;;
        int reminder=0;
        int max=(int)(Math.pow(2,31)-1);
        int min=(int)((-1)*Math.pow(2,31));
        System.out.println(min+"   "+max);
        if(x>=min && x<=max ){
            if(x>=0){
                while(x>0){
                    reminder= x%10;
                    result=result*10+reminder;
                    if(result<=min && result>=max){
                        result=0;
                        break;
                    }
                    x=x/10;

                }

            }else {
                x=x*(-1);
                while(x>0){
                    reminder= x%10;
                    result=result*10+reminder;
                    if(result<=min && result>=max){
                        result=0;
                        break;
                    }
                    x=x/10;
                }
                result=result*(-1);
            }
            return  result;
        }else return 0;
    }

    public static void main(String[] args) {
        ReverseInteger r=new ReverseInteger();
        System.out.println(r.reverse(1534236469));
    }
}
