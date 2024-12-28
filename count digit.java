import java.util.*;
public class Main{
    public static int countDigits(int N){
        int count = 0;
        while(N>0){
            count = count+1;
            N = N/10;
        }
            return count;
        }
        public static void main(String args[]){
            int N = 324567;
            System.out.println("N:"+N);
            int digits = countDigits(N);
            System.out.println("No.of digits:"+digits);
        }
    }

OUTPUT:
       N:324567
       No.of digits:6

