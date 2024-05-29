import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);

        // 우선순위 큐
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        String[] secondLine = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            minHeap.add(Integer.parseInt(secondLine[i]));
        }

        for (int i = 0; i < K - 1; i++) {
            minHeap.poll();
        }

        System.out.println(minHeap.peek());

//        정렬을 했을때는 시간 복잡도가 NlogN +N
//        우선순위 큐를 사용했을 땐 시간 복잡도가 NLongN + KLogN
//        N이 매우 크고 K가 작을 경우 우선순위 큐가 훨씬 유리해지며
//        최악 상황이 아닌 평균적인 시간복잡도에서 우선순위 큐가 더 유리하다
    }
}
