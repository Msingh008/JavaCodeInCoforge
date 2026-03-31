package DSA_EnDigest;

public class PrintPattern {
    public static void printTheNumber1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(n);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern2(3);
    }
}
