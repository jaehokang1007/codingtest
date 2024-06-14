import java.util.Scanner; // 스캐너

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 스캐너
        
        int A = sc.nextInt(); // 입력받을 A 선언
        int B = sc.nextInt(); // 입력받을 B 선언
        
        System.out.print(A + B); // A + B 출력
    }
}