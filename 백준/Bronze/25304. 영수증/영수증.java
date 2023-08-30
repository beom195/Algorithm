import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int a;
        int b;
        int total = 0;

        for(int i = 0; i < N; i++){
          String[] items = br.readLine().split(" ");
          a = Integer.parseInt(items[0]);
          b = Integer.parseInt(items[1]);

          total += a * b;
        }

        if(X == total){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        br.close();
    }
}
