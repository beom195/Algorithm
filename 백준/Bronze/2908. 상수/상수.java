import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();
        String reversedA = "";
        String reversedB = "";
        int result = 0;

        for(int i = 2; i >= 0; i--){
            reversedA += A.charAt(i);
            reversedB += B.charAt(i);

            int numA = Integer.parseInt(reversedA);
            int numB = Integer.parseInt(reversedB);

            result = Math.max(numA,numB);
        }
        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}