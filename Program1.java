import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number a");
    int a =sc.nextInt();
     System.out.println("enter the number b");
       int b =sc.nextInt();
        sc.nextLine();
          System.out.print("enter choose operation from given here add(for addition) sub(for substraction) mul(for multiplication) div(for division)");
     String oprtn = sc.nextLine();
     
     
     switch(oprtn){
            case "add":
                  System.out.println("the addition is:"+(a+b));
                  break;
             case "sub":
                 System.out.println("the subtraction is "+(a-b));
             case "mul":
                 System.out.println("the multiplication is "+(a*b));
                  break;
            case "div":
                 System.out.println("the division is:"+(a/b));
                 break;
           default:
               System.out.println("please enter valid input");
                
     }
 
     
    }
}