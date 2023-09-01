import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int result;
        for(int i = 1; i <= T; i++){

            String[] numbers = br.readLine().split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);
            bw.write("Case #" + i + ": "+ A + " + " + B + " = " + Integer.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
