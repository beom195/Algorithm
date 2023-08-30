import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i = 0; i < N; i++){
          String[] items = br.readLine().split(" ");
          int a = Integer.parseInt(items[0]);
          int b = Integer.parseInt(items[1]);

          total += a * b;
        }
        System.out.println(X == total ? "Yes": "No");

        br.close();
    }
}
