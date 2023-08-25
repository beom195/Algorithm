import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        a =  scanner.nextInt();
        b =  scanner.nextInt();
        if (a <= 10 && b > 0){

            System.out.println(a/b);
        }else {
            System.out.println("10이하 0이상의 수를 입력하세요");
        }
    }
}