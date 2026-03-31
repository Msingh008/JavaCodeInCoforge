package leetcode.problems;

public class RemoveAllOccuranceOfSubString {
    public String removeOccurances(String input,String part){
        while(input.contains(part)){
         int index=input.indexOf(part);
            System.out.println(index);
            System.out.println(input.substring(0,index)+"---"+input.substring(index+3));
            input=input.substring(0,index)+input.substring(index+part.length());
            System.out.println(input);
        }
        return input;
    }

    public static void main(String[] args) {
RemoveAllOccuranceOfSubString a=new RemoveAllOccuranceOfSubString();
String output=a.removeOccurances("axxyxyxyxyxyb","xy");
        System.out.println(output);
    }
}
