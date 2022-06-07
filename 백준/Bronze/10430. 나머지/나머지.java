import java.util.Scanner;
/**
 * 여기에 Main 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Main
{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        System.out.println(((A+ B))%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
