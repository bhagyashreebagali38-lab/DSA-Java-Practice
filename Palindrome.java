import java.util.*;

class Pal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number
        int temp = n;           // store original number
        int rev = 0;

        while(n > 0) {
            int digit = n % 10;   // get last digit
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if(rev == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
