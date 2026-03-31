public class ExceptionHandlingCode {

    public static void main(String[] args) {
        try{
            int i=10/0;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
         }finally {
            System.out.println("Finally in finally.....");
        }
        System.out.println((int)'1');

        System.out.println("Code After try catch finally");


    }
}
