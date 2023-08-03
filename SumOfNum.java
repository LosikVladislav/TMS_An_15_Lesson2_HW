import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a three-digit number");
        int num = in.nextInt();
        int sum = 0;
        while(num != 0){
            sum += (num % 10); //
            num/=10;
        }
        System.out.print("sum of number = " + sum );
    }
}
