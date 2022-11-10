import java.util.*;

class Main{
    static boolean [] check;
    static int [][] arr;
    static int cnt ,N,linkList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N  = sc.nextInt();
        linkList = sc.nextInt();

        check = new boolean [N+1];
        arr= new int [N+1][N+1];
        for(int i=0; i<linkList;i++){
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();

            arr[index1][index2] = 1;
            arr[index2][index1] = 1;
        }
        Search(1);
        System.out.println(cnt);

    }
    private static void Search(int start){
        Queue <Integer> que = new LinkedList<>();
        que.add(start);

        while (!que.isEmpty()){
            int now = que.poll();
            check[now] = true;
            for(int i=1; i<N+1;i++){
                if(!check[i]&&arr[now][i]==1){
                    check[i]  =true;
                    que.add(i);
                    cnt++;
                }
            }
        }
    }
}