import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        while (true){
            Stack <String> arr =new Stack<>();
            String list = br.readLine();
            if(list.equals(".")){
                break;
            }
            for(int i = 0; i <list.length(); i++){
                if(list.charAt(i)=='['||list.charAt(i) == '('||list.charAt(i) == '.'){
                    arr.push(String.valueOf(list.charAt(i)));
                }
                else if(list.charAt(i)==']'||list.charAt(i)==')'){
                    if(arr.isEmpty()){
                        break;
                    }
                    if(list.charAt(i)==']'){
                        if(arr.peek().equals("[")){
                            arr.pop();
                        }
                        else{
                            break;
                        }
                    }
                    else if(list.charAt(i) == ')'){
                        if(arr.peek().equals("(")){
                            arr.pop();
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.out.println("no");
                        break;
                    }
                }
            }

            if(arr.size()==1){
                if(arr.peek().equals(".")){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            else{
                System.out.println("no");
            }
        }



        }
    }

