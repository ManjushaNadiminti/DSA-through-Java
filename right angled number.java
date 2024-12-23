class Main{
    static void pattern1(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
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
       1
       12
       123
       1234
       12345
