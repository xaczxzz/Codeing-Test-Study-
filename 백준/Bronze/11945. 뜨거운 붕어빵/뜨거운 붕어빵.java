import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final int row = Integer.parseInt(br.readLine().split(" ")[0]);
        StringBuffer sb = new StringBuffer();
        IntStream.range(0, row).forEach(i -> {
            try {
                sb.append(new StringBuilder(br.readLine()).reverse()).append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        if(sb.length() > 0){
            sb.setLength(sb.length() - 1);
        }
        System.out.print(sb);
    }

}