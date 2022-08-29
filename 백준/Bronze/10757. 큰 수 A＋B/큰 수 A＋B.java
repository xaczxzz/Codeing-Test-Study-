import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main (String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		BigInteger big = new BigInteger(st.nextToken());
		BigInteger big2 = new BigInteger(st.nextToken());
		System.out.println(big.add(big2));
	}
}