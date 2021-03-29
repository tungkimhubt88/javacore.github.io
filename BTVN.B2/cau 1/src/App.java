import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a :  ");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên b : ");
        int b = sc.nextInt();
        System.out.println("Nhập số nguyên c : ");
        int c = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                }

            } else {
                System.out.println("Phương trình có 1 nghiệm là : " + (-c / b));
            }
        } else {

            double x1, x2;
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm x1 là : " + x1);
                System.out.println("Phương trình có nghiệm x2 là : " + x2);

            } else {
                System.out.println("Phương trình có 2 nghiệm kép x1=x2 là : " + (-b / (2 * a)));
            }
        }
    }

}
