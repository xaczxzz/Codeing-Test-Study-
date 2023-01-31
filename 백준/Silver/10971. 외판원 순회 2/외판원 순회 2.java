import java.io.*;

public class Main {

    static int N;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(list[j - 1]);
            }
        }

        visited[1] = true;
        dfs(1, 1, 1, 0);

        bw.write(min + "\n");
        bw.flush();

    }

    public static void dfs(int start, int now, int cnt, int cost) {

        if (now == start && cost > 0) {
            min = Math.min(min, cost);
            return;
        }

        for (int n = 1; n <= N; n++) {

            if (arr[now][n] > 0) {

                if (n == start && cnt == N) {
                    cost +=arr[now][n];
                    dfs(start, n, cnt + 1, cost);
                }

                else if (!visited[n]) {
                    visited[n] = true;
                    cost += arr[now][n];

                    dfs(start, n, cnt + 1, cost);

                    cost -= arr[now][n];
                    visited[n] = false;
                }
            }
        }
    }

}