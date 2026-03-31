package leetcode.problems;

public class GetKthCharInGameI {
    public static final GetKthCharInGameI game=new GetKthCharInGameI();

    public static void main(String[] args) {
        System.out.println(getKthChar(9999990));
        System.out.println((int)'z');
    }
    private static char getKthChar(int index){
        String input="a";
        while(input.length()<index){
            String temp="";
            for(int i=0;i<input.length();i++){
                if((int)input.charAt(i)<122){
                temp=temp+String.valueOf((char)((int)input.charAt(i)+1));}
                else        temp=temp+String.valueOf('a');

        }
            input=input+temp;


        }
        System.out.println(input);
        return input.charAt(index-1);
    }
}
