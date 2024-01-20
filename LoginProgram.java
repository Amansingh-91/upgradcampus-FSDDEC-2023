import java.util.Scanner;
public class LoginProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName ;
        String pass ;
        System.out.println("enter user name");
        userName = sc.nextLine();
        System.out.println("enter pass");
        pass = sc.nextLine();

        // if(userName.equals("aman")){
        //     if(pass.equals("1234")){
        //         System.out.println("login Successfull");
        //     }
        //     else{
        //         System.out.println("invalid username or pass");
        //     }
        // }
        // else{
        //     System.out.println("invalid username or pass");
        // }
        // logical operator
        //  and (&&) , or (||), not (!)
        // assign A and B => compulsory
        // assign A or B => choice
        // ! 

        if(userName.equals("aman") && pass.equals("1234")){
            
            System.out.println("login Successfull");

        }
        else{
            System.out.println("invalid username or pass");
        }
    }
}
