import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] numbers = str.split(" ");

        long a = Long.parseLong(numbers[0]);
        long b = Long.parseLong(numbers[1]);
        long c = Long.parseLong(numbers[2]);

        System.out.println(a+b+c);
        br.close();
    }
}
