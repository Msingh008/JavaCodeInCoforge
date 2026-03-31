package leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        Map<Character,String> characterNumberMapping=new HashMap<>();
        List<String> result=new ArrayList<>();
        characterNumberMapping.put('2',"abc");
        characterNumberMapping.put('3',"def");
        characterNumberMapping.put('4',"ghi");
        characterNumberMapping.put('5',"jkl");
        characterNumberMapping.put('6',"mno");
        characterNumberMapping.put('7',"pqrs");
        characterNumberMapping.put('8',"tuv");
        characterNumberMapping.put('9',"wxyz");





        if(digits==""){
            return result;
        }else if(digits.length()>=1){
        for(int i=0;i<digits.length();i++){
            for(int j=i+1;j<digits.length()-1;j++){
                char[] ithCarArry = characterNumberMapping.get(digits.charAt(i)).toCharArray();
                char[] jthCarArry = characterNumberMapping.get(digits.charAt(j)).toCharArray();
                for(char c:ithCarArry){
                    for(char d:jthCarArry){
                        String t="";
                        t=t+String.valueOf(c)+String.valueOf(d);
                        result.add(t);
                    }
                }

            }
            }
        }
        return  result;
        }
    public static void main(String[] args) {
        List<String> resu = letterCombinations("2");
        System.out.println(resu);
    }

    }


