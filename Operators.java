public class Operators {
    // Airthematic operators
    public static void main(String[] args) {
        // operands1 + operand2 => sum of operands 
        // operands1 - operand2 => sub of operands  5 - 2 => 3
        // operands1 * operand2 => multiply of operands 
        // operands1 / operand2 => division of operands 
        // operands1 % operand2 => reminder of operands 
        // ++ increment operator 
        // -- decrement operator
        // pre increment or pre decrement
        // post increment and post decrement

        int firstNumber = 5; //
        int secondNumber = 10;

        int sumOfNumber  = firstNumber + secondNumber; // 5 + 10 => 15
        System.out.println("sum = " + sumOfNumber);
        
        int subOfNumber  = firstNumber - secondNumber; // 5 - 10 => -5
        System.out.println("sub = " + subOfNumber);
        
        int mulOfNumber  = firstNumber * secondNumber; // 5 * 10 => 50
        System.out.println("mul = " + mulOfNumber);
 
        int divOfNumber  = firstNumber / secondNumber; // 5 / 10 => 
        System.out.println("divide = " + divOfNumber);

        int modOfNumber  = firstNumber % secondNumber; // 5 % 10 =>
        System.out.println("mod = " + modOfNumber);

        System.out.println("first number = "+firstNumber);
        System.out.println("Second number = " + secondNumber);  
        
        // pre increment or pre decrement

        int preIncrement = ++firstNumber + 10;
        System.out.println("pre increment = "+preIncrement + " firstNUmber = "+ firstNumber);
        int postIncrement = firstNumber++ + 10;
        System.out.println("post increment = "+postIncrement + " firstNUmber = "+ firstNumber);
         
        // 10/2*5+3 * 6 /2=>BODMAS
        // Bracket > pre > post > *,/,% > +,- 
        // when equal precendence and solve which ever comes first 
        int a = 5;
        int b = 6 ;
        int c = 2;
        int z = ++a + (--a * 3) / --c;

        // value of a b c and z
        System.out.println("z = "+ z +"a = "+ a+"b = "+ b+"c = "+ c );
        System.out.println(1 + 2 / (0 + 1));
    }
}
