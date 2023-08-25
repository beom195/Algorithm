import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =  scanner.nextInt();
        int b =  scanner.nextInt();

        // A+B
        System.out.println(a+b);

        // A-B
        System.out.println(a-b);

        // A*B
        System.out.println(a*b);

        // A/B
        if (a >= 1 && b <= 10000){
            System.out.println(a/b);
        }else {
            System.out.println("10000이하 1이상의 수를 입력하세요");
        }
        // A%B
        System.out.println(a%b);
    }
}
