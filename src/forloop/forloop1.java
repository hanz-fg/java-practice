package forloop;
import java.util.Scanner;

//Question 1: Sum of Multiples

public class forloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        int n = sc.nextInt();

        forloop1 f = new forloop1();
        int result = f.sumOfMultiples(n);

        System.out.println("Output: " + result);

        sc.close();
    }

    public int sumOfMultiples(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if (i % 3 == 0 || i % 5 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
