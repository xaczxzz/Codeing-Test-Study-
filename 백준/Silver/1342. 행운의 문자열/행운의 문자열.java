import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int result = 0;
    static char [] alphabetChars = new char[27];
    public static void dfs(int index,String word, int len){
        if(index ==len){
            result++;
            return;
        }
        for(int i=0; i<26; i++){
            if(alphabetChars[i] == 0){
                continue;
            }
            if(word !=""&&word.charAt(word.length()-1)==(char)('a'+i)){
                continue;
            }
            alphabetChars[i]--;
            dfs(index+1, word+(char)('a'+i),len);
            alphabetChars[i]++;

        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        ArrayList <String> arr= new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            alphabetChars[S.charAt(i)-'a']++;
        }
        dfs(0,"",S.length());
        System.out.println(result);
    }
}
