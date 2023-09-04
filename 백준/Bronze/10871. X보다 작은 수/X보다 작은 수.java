import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int[] numbers = new int[st2.countTokens()];

        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(st2.nextToken());
            if (X > numbers[i]){
                bw.write(numbers[i] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
