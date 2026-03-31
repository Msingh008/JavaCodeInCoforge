public class GetSumOfDigitsInString {
    public static void main(String[] args) {
        String input="abcd12345xyz";
        int sum=0;
        for(int i=0;i<input.length();i++){

            if(Character.isDigit(input.charAt(i))){
                sum+=Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        System.out.println("The sume is: "+sum);
    }
}

