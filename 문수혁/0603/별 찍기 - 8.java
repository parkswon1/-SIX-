import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1; i <= 2*N-1; i++){ // 2N-1번 줄까지 출력

            if (i <= N) {  // N번쨰 줄까지 윗부분으로 친다.

                for (int j = 1; j <= N - (N - i); j++) { // 별 증가
                    System.out.print("*");
                }

                for (int k = 1; k <= 2 * N - (2 * i); k++) { // 공백 감소
                    System.out.print(" ");
                }

                for (int l = 1; l <= N - (N - i); l++) { // 별 증가
                    System.out.print("*");
                }

            }else { // 나머지 아랫 부분
                for (int j = 1; j <= N-(i-N); j++) { // 별 감소 부분
                    System.out.print("*");
                }

                for (int k = 1; k <= 2 * i - 2 * N; k++) { // 공백 증가 부분
                    System.out.print(" ");
                }

                for (int l = 1; l <= N-(i-N); l++) { // 별 감소 부분
                    System.out.print("*");
                }
            }
            System.out.println(); // 줄바꿈
        }
    }
}