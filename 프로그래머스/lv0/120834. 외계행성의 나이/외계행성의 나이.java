class Solution {
    public String solution(int age) {
        String answer = "";
        String list = String.valueOf(age);
        String [] s = list.split("");
        for(int i=0; i<s.length; i++){
            answer += ((char)((Integer.parseInt(s[i])+97)));
        }
        return answer;
    }
}