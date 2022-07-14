import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr ;
		for(int i=0; i<n;i++) {
			int size = sc.nextInt();
			double result =0;
			arr = new int [size];
			
			for(int j=0; j<size;j++) {
				
				arr[j] = sc.nextInt();
				result += arr[j];
				
			}
			double avg = (result/size);
			double count =0;
			
			for(int k=0; k<arr.length; k++) {
				if(arr[k]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/size)*100);
			
		}
		sc.close();
		
	}
}
