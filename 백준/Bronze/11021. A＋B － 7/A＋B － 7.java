import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int result;
        for(int i = 1; i <= T; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            result = Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken());
            bw.write("Case #"+i +": " + result + "\n");
        }

        bw.flush();
        br.close();
    }
}
