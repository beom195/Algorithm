import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        // 각 바구니에 1부터 N번 까지의 공을 넣는다
        for(int i = 0; i < N; i++){
            basket[i] = i + 1;
        }

        int I,J;

        for(int j = 0; j < M; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            I = Integer.parseInt(st2.nextToken());
            J = Integer.parseInt(st2.nextToken());

            int changedBall = basket[I - 1];

            basket[I - 1] = basket[J - 1];
            basket[J - 1] = changedBall;

        }
        for(int m = 0; m < N; m++){
            bw.write(basket[m] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}