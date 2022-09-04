import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int time = Integer.parseInt(bf.readLine());
		int [] arr = new int[time];
		for(int i=0; i<time; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		for(int i=0; i<time; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}
}