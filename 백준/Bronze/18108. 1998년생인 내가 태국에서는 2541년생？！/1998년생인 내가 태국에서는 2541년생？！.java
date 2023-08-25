import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String y;
        y = br.readLine();
        int years = Integer.parseInt(y);
        System.out.println(years - 543);
    }
}
