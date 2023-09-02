import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String result = "";

        for(int i = 1; i <= N; i++){
            result += "*";
            bw.write(result);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
