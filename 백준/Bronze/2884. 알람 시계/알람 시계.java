import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] alarm = br.readLine().split(" ");
        int h = Integer.parseInt(alarm[0]);
        int m = Integer.parseInt(alarm[1]);
        int maxM = 60;

        // 45분 또는 45분 이상일 경우 45를 빼주고 시간 바로 출력
        if(m >= 45){
            m -= 45;
            System.out.println(h+" "+m);
        }else if (m < 45) {
            // 45분 미만일 경우 1시간이 줄어들기 때문에 h-1을 해준다
            h -= 1;

            // 입력값이 40분이였다고 가정했을때 -5분은 존재하지 않기 때문에 60분에서 -5를 해준다
            m -= 45;

            //00시에서 45분을 빼면 23시로 넘어간다.
            if(h < 0){
                h = 23;
            }
            if (m < 0){
            //60분에서 -5분을 빼주려면 더하기를 해줘 60분 - 5분을 해준다 그러면 55분이 되어 45분이 정상적으로 빼짐.
                m = maxM + m;
            }
            System.out.println(h + " " + m);
        }

        br.close();
    }
}