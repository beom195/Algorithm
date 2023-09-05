import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -10000000;
        int min = 10000000;

        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,numbers[i]);
            min = Math.min(min,numbers[i]);
        }

        bw.write(min + " " + max);


        bw.flush();
        bw.close();
        br.close();
    }
}
