import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();

        String num = sc.next();
        for(int i = 0; i <num.length(); i++){
            arr.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        arr.sort(Comparator.reverseOrder());
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i));
        }
    }
}

