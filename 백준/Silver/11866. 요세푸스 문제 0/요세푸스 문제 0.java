import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        int K =sc.nextInt();
        for(int i=0; i<N;i++){
            queue.add(i+1);
        }
        int count =0;
        while(true){
            if(arr.size() == N){
                break;
            }
            count++;
            if(count ==K){
                count=0;
                arr.add(queue.poll());

            }
            else{
                queue.add(queue.poll());

            }
        }
        System.out.print("<"+arr.get(0));
        for(int i=1; i<arr.size();i++){
            System.out.print(", "+arr.get(i));
        }
        System.out.print(">");


    }
}

