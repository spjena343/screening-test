import java.util.Scanner;
public class Program2 {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter your input");
    int a = sc.nextInt();
   

    for (int i = 1; i <= a; i++) {
        int num = 2 * i - 1;
        System.out.println("output:");
        System.out.print(num + " ");
    }
    }
}
