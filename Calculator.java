import java.util.Scanner;

public class Calculator {
    public double addition(double numberOne, double numberTwo){
        double sum =  numberOne + numberTwo;
        return sum;
    }
    public double subtraction(double numberOne, double numberTwo){
        double sub =  numberOne - numberTwo;
        return sub;
    }
    public double multiplication(double numberOne, double numberTwo){
        double mul =  numberOne * numberTwo;
        return mul;
    }
    public double division(double numberOne, double numberTwo){
        double div =  numberOne / numberTwo;
        return div;
    }
    public double square(double numberOne){
        return numberOne * numberOne;
    }

    public double power(double numberOne,double pow){
        return Math.pow(numberOne,pow);
    }
    public void printResult(double result){
        System.out.println("Result = "+ result);
    }

    public void myCalculator(Calculator cal , Scanner sc){
        
            double result = 0;
            System.out.println("Standard Calculator");
            cal.printResult(result);
            // my first number
            System.out.println("enter the number");
            result = sc.nextDouble();
            sc.nextLine();
            
            out:
            do{
                System.out.println("Operations you can perform");
                System.out.println("for addition press +");
                System.out.println("for subtraction press -");
                System.out.println("for multiplication press *");
                System.out.println("for division press /");
                System.out.println("for square press ^");
                System.out.println("for power press p");
                System.out.println("to clear the result press c");
                System.out.println("to exit the calculator press x");

                String operation  = sc.nextLine();
                double secondNumber = 0;
                switch (operation) {
                    case "+":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = cal.addition(result, secondNumber);
                        break;
                    case "-":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = cal.subtraction(result, secondNumber);
                        break;
                    case "*":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = cal.multiplication(result, secondNumber);
                        break;
                    case "/":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = cal.division(result, secondNumber);
                        break;
                    case "^":
                        result = cal.square(result);
                        break;
                    case "p":
                        System.out.println("enter the power");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = cal.power(result, secondNumber);
                        break;
                    case "c":
                        result = 0;
                        cal.printResult(result);
                        System.out.println("enter the number");
                        result = sc.nextDouble();
                        sc.nextLine();
                        break;
                    case "x":
                        cal.printResult(result);
                        System.out.println("closing the  calculator");
                        break out;
                
                    default:
                        System.out.println("Wrong operation");
                        break;
                }

                cal.printResult(result);
            }while(true);
        
    }

    public void myCalculatorWithExceptionHandle(){
        try {
            Scanner sc = new Scanner(System.in);

            double result = 0;
            System.out.println("Standard Calculator");
            this.printResult(result);
            // my first number
            System.out.println("enter the number");
            result = sc.nextDouble();
            sc.nextLine();
            
            out:
            do{
                System.out.println("Operations you can perform");
                System.out.println("for addition press +");
                System.out.println("for subtraction press -");
                System.out.println("for multiplication press *");
                System.out.println("for division press /");
                System.out.println("for square press ^");
                System.out.println("for power press p");
                System.out.println("to clear the result press c");
                System.out.println("to exit the calculator press x");

                String operation  = sc.nextLine();
                double secondNumber = 0;
                switch (operation) {
                    case "+":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = this.addition(result, secondNumber);
                        break;
                    case "-":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = this.subtraction(result, secondNumber);
                        break;
                    case "*":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = this.multiplication(result, secondNumber);
                        break;
                    case "/":
                        System.out.println("enter the number");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = this.division(result, secondNumber);
                        break;
                    case "^":
                        result = this.square(result);
                        break;
                    case "p":
                        System.out.println("enter the power");
                        secondNumber = sc.nextDouble();
                        sc.nextLine();
                        result = this.power(result, secondNumber);
                        break;
                    case "c":
                        result = 0;
                        this.printResult(result);
                        System.out.println("enter the number");
                        result = sc.nextDouble();
                        sc.nextLine();
                        break;
                    case "x":
                        this.printResult(result);
                        System.out.println("closing the  calculator");
                        break out;
                
                    default:
                        System.out.println("Wrong operation");
                        break;
                }

                this.printResult(result);
            }while(true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Restarting the calculator");
            this.myCalculatorWithExceptionHandle();
        }
        
    
    }

    public static void main(String[] args) {
        Calculator cal =  new Calculator();
        Scanner sc = new Scanner(System.in);
        // FunctionDemo obj =  new FunctionDemo();
        // obj.greeting();
        // obj.greetWithName("Jack",29);
        // // System.out.println("Hey Friends");

        // // 1 + 2 + 3 + 4 => 3 + 3 + 4 => 6 + 4 => 10
        // double sum = cal.addition(1, 2) + cal.addition(3, 4);
        // System.out.println(sum);
        
        // cal.myCalculator(cal, sc);
        
        
        cal.myCalculatorWithExceptionHandle();



    }
}
