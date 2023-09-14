import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String str = br.readLine();

            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            bw.write(first + "" + last + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}