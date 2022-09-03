import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr1.add(sc.nextInt());
        }
        if(arr1.get(0) == 1){
            for(int i=0; i<arr1.size(); i++){
                if(i+1 != arr1.get(i)){
                    System.out.println("mixed");
                    System.exit(0);
                }
            }
            System.out.println("ascending");
        }
        else if(arr1.get(0) == 8){
            int num = 0;
            for(int i=arr1.size(); i>0; i--){
                if(arr1.get(num) != i){
                    System.out.println("mixed");
                    System.exit(0);
                }
                num ++;
            }
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }


    }

}


