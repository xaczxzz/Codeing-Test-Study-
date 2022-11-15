import java.io.*;
import java.util.*;

public class Main {
    static int nV, nE;
    static int ad[][];
    static boolean visit[];
    static int count[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nV = Integer.parseInt(st.nextToken());
        nE = Integer.parseInt(st.nextToken());

        ad = new int[nV+1][nV+1];
        int sum[] = new int[nV+1];
        count = new int[nV+1][nV+1];
        int indexvalue = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < nE; i++){
            st = new StringTokenizer(br.readLine());
            int s1 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            ad[s1][s2] = ad[s2][s1] = 1;
        }

        for(int i = 1; i <= nV; i++){
            visit = new boolean[nV+1];
            bfs(i);
        }

        for(int i = 1; i <= nV; i++){
            for(int j = 1; j <= nV; j++){
             
                sum[i] += count[i][j];
            }
        }

        for(int i = 1; i <= nV; i++){
            if(sum[i] < indexvalue){
                indexvalue = sum[i];
                index = i;
            }
        }

        System.out.print(index);
    }
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visit[start] = true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 1; i <= nV; i++) {
                if (!visit[i] && ad[cur][i] == 1) {
                    q.offer(i);
                    visit[i] = true;
                    count[start][i] = count[start][cur] + 1;
                }
            }
        }
    }
}

