package leetcode.problems;

public class LongestcommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
     if(strs[0].length()==0) return "";
     if(strs[0].length()==1)  return strs[0];
     for(int i=0;i<strs.length;i++){
       while (!strs[i].startsWith(prefix)){
           prefix=prefix.substring(0,prefix.length()-1);
           if(prefix.length()==0){
               return "";
           }
       }
     }
     return prefix;
    }

    public static void main(String[] args) {
        String pm = longestCommonPrefix(new String[]{"acc","aaa","aaba"});
        System.out.println(pm);
    }
}
