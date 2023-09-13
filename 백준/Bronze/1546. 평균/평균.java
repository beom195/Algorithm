import java.io.*;
import java.nio.DoubleBuffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Double[] scores = new Double[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Double max = Double.MIN_VALUE;
        Double[] results = new Double[N];
        Double total = 0.0;
        Double result = 0.0;

        for(int i = 0; i < N; i++){
            scores[i] = Double.parseDouble(st.nextToken());

            if(scores[i] > max){
                max = scores[i];
            }
        }

        for(int i = 0; i < N; i++){
            results[i] = scores[i]/max*100;
            total += results[i];
            result = total / N;
        }
        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}