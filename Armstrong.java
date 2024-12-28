import java.util.*;
public class Main {
    public static boolean Armstrong(int n) {
        int originalNumber = n;
        int k = String.valueOf(n).length();
        int sum = 0;
        while(n>0) {
            int ld = n%10;
            sum += Math.pow(ld,k);
            n = n/10;
        }
        return sum == originalNumber;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = sc.nextInt();
        if(Armstrong(n)){
             System.out.println("Armstrong");
        }
        else{
             System.out.println("not an Armstrong");
        }
    }
}
