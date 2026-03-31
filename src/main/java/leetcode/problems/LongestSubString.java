    package leetcode.problems;

    import java.util.HashSet;

    public class LongestSubString {
        public static int lengthOfLongestSubstring(String s) {
            String subStr1 = "";
            String subString2="";
          for(int i=0;i<s.length();i++){
              if(subStr1.contains(String.valueOf(s.charAt(i)))){
                  if(subStr1.length()>= subString2.length()){
                  subString2=subStr1;
                  }
                  subStr1=subStr1.substring(subStr1.indexOf(s.charAt(i))+1,subStr1.length());
                  subStr1+=String.valueOf(s.charAt(i));

              }else {
                  subStr1+=s.charAt(i);
              }
          }
            if(subStr1.length()>subString2.length()){
                return subStr1.length();
            }else return subString2.length();
        }

            public static void main (String[]args) {
                System.out.println(lengthOfLongestSubstring(" "));
                System.out.println(Math.max(0,0));

            }
        }
