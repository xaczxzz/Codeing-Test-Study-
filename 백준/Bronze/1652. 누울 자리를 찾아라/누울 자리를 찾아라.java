import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char [][] arr =new char [101][101];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String cc = st.nextToken();
            for(int j = 0; j<N ; j++){
               arr[i][j] = (cc.charAt(j));
            }
            arr[i][N] = arr[N][i] ='X';
        }
        int x = 0;
        int y = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N-1; j++){
                if(arr[i][j]==('.')&&arr[i][j+1]==('.')&&arr[i][j+2]==('X')){
                    x++;
                }
                if(arr[j][i]==('.')&&arr[j+1][i]==('.')&&arr[j+2][i]==('X')){
                    y++;
                }
            }
        }
        System.out.println(x+" "+y);
    }

}
