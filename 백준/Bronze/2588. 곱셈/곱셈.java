import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;
        int temp2 = num2;
        while (num2 > 0) {
            temp = num2 % 10;
            System.out.println(num1 * temp);
            num2 /= 10;
        }
        System.out.println(num1 * temp2);
    }
}