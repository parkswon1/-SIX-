import java.io.*;
import java.util.Arrays;

public class 수정렬하기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine()); //전체 입력받을 수
            int[] arr = new int[N]; //입력받을 수 크기 N의 배열을 만든다
            for (int i = 0; i < N; i++){
                int a = Integer.parseInt(br.readLine());
                arr[i] = a;
            }
            Arrays.sort(arr); // 오름차순으로 배열
            for (int i = 0; i < N; i++){ //첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력
                bw.write(arr[i] + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
