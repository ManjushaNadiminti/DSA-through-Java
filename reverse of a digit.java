import java.util.*;
public class Main{
    public static int revNum(int n){
        int revNum = 0;
        while(n>0){
            int ld = n%10;
            revNum = (revNum*10) + ld;
            n = n/10;
        }
        return revNum;
    }
    public static void main(String args[]){
        int n =9891;
        System.out.println("n:"+n);
        int Num = revNum(n);
        System.out.println("revNum:"+Num);
    }
}

OUTPUT:
       n:9891
       revNum:1989

