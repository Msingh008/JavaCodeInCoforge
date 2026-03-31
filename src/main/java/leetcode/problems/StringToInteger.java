package leetcode.problems;

public class StringToInteger {
    public static int myAtoi(String s) {
        int counter = 0;
        long result = 0;
        boolean flag=false;
        if (s.length() != 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    counter = i;
                    break;
                }
            }
            if (s.charAt(counter) != '+' || s.charAt(counter) != '-' || (int) s.charAt(counter) < 48 || (int) s.charAt(counter) > 57) {
                result = 0;
            }
            if (s.charAt(counter) == '-' || s.charAt(counter) == '+') {
                for (int i = counter + 1; i < s.length(); i++) {
                    if ((int) s.charAt(i) < 47 || (int) s.charAt(i) > 57) {
                        break;
                    } else result = result * 10 + ((int) s.charAt(i) - 48);
                    if (result >= 2147483647) {
                        flag = true;
                        break;
                    }
                }
            }
                if ((int) s.charAt(counter) >= 48 && (int) s.charAt(counter) <= 57) {
                    for (int i = counter; i < s.length(); i++) {
                        if ((int) s.charAt(i) < 47 || (int) s.charAt(i) > 57) {
                            break;
                        } else result = result * 10 + ((int) s.charAt(i) - 48);
                        if (result >= 2147483647) {
                            flag = true;
                            break;
                        }
                    }

                }
                if (s.charAt(counter) == '-') {
                    if (!flag) {
                        result = result * (-1);
                    } else result = -2147483648;
                } else if (flag == true && s.charAt(counter) != '-') {
                    result = 2147483647;
                }
                return (int) result;
            }else return 0;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"
        ));
    }
    }

