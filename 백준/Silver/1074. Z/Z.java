import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int cnt;
    public static void recurion(int size, int r, int c){
        if(size==1){
            return;
        }
        int num = size/2;
        if(r<num &&c <num){
            recurion(num,r,c);
        }
        else if(r < num&& c >=num){
            cnt += (size*size)/4;
            recurion(num,r,c-num);
        }
        else if(r>=num&& c< num){
            cnt += ((size*size)/4)*2;
            recurion(num,r-num,c);
        }
        else {
            cnt += ((size*size)/4)*3;
            recurion(num,r-num,c-num);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int)Math.pow(2,N);
        recurion(size,r,c);
        System.out.println(cnt);

    }
}






