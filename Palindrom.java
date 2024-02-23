/**
 * Palindrom
 */
public class Palindrom {
    static int s=0;
    public static void main(String[] args) {
        int n=153;
        while (n>0) {
            int l=n%10;
            s =s*10+l;
            n=n/10;
        }
        System.out.println(s);
    }
}