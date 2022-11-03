import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int [n][m];
        StringBuilder sb = new StringBuilder();
        int result=0;
        for(int z =0; z<2; z++){
            for(int i=0; i<n; i++){
                for(int j =0; j<m; j++){
                    arr[i][j] += sc.nextInt();
                }
            }

        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        }
    }







