import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine(),"");
        String S = st.nextToken();
        char[] ch = new char[26];
        int index = 0;

        for(char i = 97; i <= 122; i++){
            ch[index++] = i;
        }

        for(int i = 0; i < ch.length; i++){
            int result = S.indexOf(ch[i]);
            bw.write(result + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}