import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strings = str.split("");
        int result = 0;

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(strings[i]);
            result += num;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}