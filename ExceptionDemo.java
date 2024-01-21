import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // try catch finally throw throws
        // Compile time and runtime exception
        System.out.println("In Exception Demo");
        System.out.println("enter the number");
        try {
            int a = sc.nextInt();
            sc.nextLine();

            int d = 10 / a;
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("please provide number as input only");
        } catch(ArithmeticException e){
            System.out.println("denominator cannot be 0");
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            // close important resources or perform important task 
            // 100 - 500 = -400
        }
        
        // int a = sc.nextInt();
        // sc.nextLine();
        System.out.println("program starts running normally");

    }
}
