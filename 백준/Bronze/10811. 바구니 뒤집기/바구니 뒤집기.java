import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        //바구니 1번부터 번호 순으로 놓기
        for(int i = 0; i < N; i++){
            basket[i] = i + 1;
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st2.nextToken()) - 1;
            int J = Integer.parseInt(st2.nextToken()) - 1;

            for(int j = I; j < J; j++){
                int before = basket[I];
                basket[I++] = basket[J];
                basket[J--] = before;
            }
        }

        for(int i = 0; i < N; i++){
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}