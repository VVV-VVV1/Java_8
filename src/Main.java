import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fun(n);

    }

    public static void fun(int n){
        int i = n % 10;
        if(i % 2 != 0){
            System.out.println(i);
        }
        var num = n;
        var lenght = String.valueOf(num).length();
        if((lenght == 0) || (num == 0)){
            return;
        }
        fun(n / 10);
    }
}
