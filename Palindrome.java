public class Main {
    public static boolean Palindrome(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = revNum * 10 + ld;
            n = n / 10;
        }
        if (dup == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int n = 1221;
        if (Palindrome(n)) {
            System.out.println("Palindrome: " + n + " is a palindrome");
        } else {
            System.out.println("Not a palindrome: " + n + " is not a palindrome");
        }
    }
}

OUTPUT: Palindrome: 1221 is a palindrome
