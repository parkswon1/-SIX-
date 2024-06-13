import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주사위문제 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[3];


        try {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 3; i++) {//크기가 3인 배열에 값 추가
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);

            if (a[0] == a[2]) { // 같은 눈이 3개가 나오는 경우
                bw.write(10000 + a[1] * 1000 + "\n");
            } else if (a[0] == a[1]) { // 같은 눈이 2개만 나오는 경우
                bw.write(1000 + a[1] * 100 + "\n");
            } else if (a[1] == a[2]) { // 같은 눈이 2개만 나오는 경우
                bw.write(1000 + a[1] * 100 + "\n");
            } else {
                bw.write(a[2] * 100 + "\n"); // 모두 다른 눈이 나오는 경우
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}