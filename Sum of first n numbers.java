import java.util.*;
public class Sum {
    public static int sum(int n) {
        int sum= 0;
        for (int i = 1; i <= n; i++) {
            sum +=i; 
        }
        return sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("The sum of first  " + n + " numbers is: " +sum (n));
    }
}
