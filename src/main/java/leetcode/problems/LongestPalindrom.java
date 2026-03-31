package leetcode.problems;

public class LongestPalindrom {
    public static String longestPalindrome(String s) {
        String output="";
     for(int i=0;i<s.length();i++){
         for(int j=s.length();j>i;j--){
             String values=s.substring(i,j);
            StringBuilder sb=new StringBuilder(s.substring(i,j));
            if(values.equals(sb.reverse().toString())){
                if(output.length()<values.length()){
                    output=values;
                }
            }

         }
     }
     return output;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
