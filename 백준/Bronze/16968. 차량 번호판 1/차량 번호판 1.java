import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String Input = st.nextToken();
        int flag = 0;
        int result = 1;
        if (Input.charAt(0) == 'd') {
            result *= 10;
        } else {
            result *= 26;
        }
        for (int i = 1; i < Input.length(); i++) {
            flag++;

            if (Input.charAt(i - 1) == Input.charAt(i)) {
                if (Input.charAt(i) == 'c') {
                    result *= 25;
                } else {
                    result *= 9;
                }
            } else {
                if (Input.charAt(i) == 'c') {
                    result *= 26;
                } else {
                    result *= 10;
                }
            }
        }
        System.out.println(result);

    }
}





