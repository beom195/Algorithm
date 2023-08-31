import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String result = "";

        for (int i = 1; i <= N; i++){
            if(i % 4 == 0){
            result += "long ";
            }
        }
        System.out.println(result +"int");
        br.close();
    }
}
