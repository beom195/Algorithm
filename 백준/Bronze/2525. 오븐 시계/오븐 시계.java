import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] oven = br.readLine().split(" ");
        int h = Integer.parseInt(oven[0]);
        int m = Integer.parseInt(oven[1]);
        int time = Integer.parseInt(br.readLine());
        int totalMinutes = m + time;

        if(totalMinutes < 60){
            m += time;
        }else if(totalMinutes >= 60){
            h += totalMinutes / 60;
            m = (totalMinutes) % 60;
            if(h >= 24){
                h %= 24;
            }
        }
        System.out.println(h + " " + m);
        br.close();
    }
}