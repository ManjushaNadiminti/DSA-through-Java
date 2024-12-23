class Main{
    static void pattern1(int N){
        for(int i=0;i<=N;i++){
            for(int j=N;j>i;j--){
                System.out.print(N-j+1);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int N = 5;
        pattern1(N);
    }
}

OUTPUT:
       12345
       1234
       123
       12
       1
