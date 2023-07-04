import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input ");
        int a = sc.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + " ");
        }
    }
}
