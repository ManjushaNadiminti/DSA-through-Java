class Main{
    static void pattern1(int N){
        for(int i=1;i<N;i++){
            for(int j=N;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int N = 6;
        pattern1(N);
    }
}

OUTPUT:
       *****
       ****
       ***
       **
       *
