public class Pattern_2 {
    static void printPattern(int n){
        if(n==0){
            return ;
        }
        System.out.println(" ");
        printPattern(n-1);

    }
    static void pattern(int n,int j){
        if(n==0){
            return;
        }
        System.out.println("*");
        printPattern(n-1);
    }
    public static void main(String[] args) {
        int n;
        pattern(5,1);
    }
}
