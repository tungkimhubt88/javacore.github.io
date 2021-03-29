import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);
        int x , num1 = 0 , num2 = 1 ;

        System.out.printf("Nhập vào một số bất kì : ");
        x = tk.nextInt();

        System.out.println("Chuỗi Fibonacci với  "+x+" số là :  ");
        int i = 0 ;
        while(i <= x)
        {
            System.out.print(num1 + "-" );
             int sumOfPrevTwo = num1 + num2;
             num1 = num2;
             num2 = sumOfPrevTwo;
                i++;
        }
        tk.close();
    }
    
}