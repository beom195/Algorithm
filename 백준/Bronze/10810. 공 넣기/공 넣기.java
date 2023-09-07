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

        int i,j,k;

        for(int i1 = 0; i1 < M; i1++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            i = Integer.parseInt(st2.nextToken());
            j = Integer.parseInt(st2.nextToken());
            k = Integer.parseInt(st2.nextToken());

            for(int i2 = i-1; i2 < j; i2 ++){
                basket[i2] = k;
            }
        }
        for(int i3 = 0; i3 < N; i3++){
            bw.write(basket[i3] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}