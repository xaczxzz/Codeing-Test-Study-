import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int [] arr;
    static int [] flag;
    static int N;
    static int Max = Integer.MIN_VALUE;
    static int Min = Integer.MAX_VALUE;
    static public void search(int result, int length){
        if(length==N){
            Max = Math.max(Max,result);
            Min = Math.min(result,Min);
            return ;
        }
        for(int i=0; i<4; i++){
            if(flag[i]>0){
                flag[i]--;
                switch (i){
                    case 0:
                        search(result+arr[length],length+1);
                        break;
                    case 1:
                        search(result-arr[length],length+1);
                        break;
                    case 2:
                        search(result*arr[length], length + 1);
                        break;
                    case 3:
                        search(result/arr[length], length+1);
                        break;
                }
                flag[i]++;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        arr= new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        flag = new int[4];
        for(int i=0; i<4; i++){
            flag[i] = Integer.parseInt(st.nextToken());
        }
        search(arr[0],1);
        System.out.println(Max);
        System.out.println(Min);
    }
}