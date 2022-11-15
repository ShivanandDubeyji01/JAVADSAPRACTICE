import java.util.Scanner;

public class PrintDigits {
    static void get(int n){
     
    if(n == 0)
    {
        return ;
    }
 
    get(n / 10);
   

    System.out.println(n%10);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        get(n);

    }
}
