public class FunctionDemo {

    // Normal function
    // function with fixed nature
    // creating the function
    // function w/o parameter and w/o return type
    public void greeting(){
        System.out.println("Hello Friends");
    }

    // function with parameter and w/o return type
    public void greetWithName(String name,int age){
        System.out.println("Hello "+ name +" your are "+age+" year old");
    }
    
    public static void main(String[] args) {
        // use function we need object of class (permission)
        // object creation 
        FunctionDemo obj = new FunctionDemo();

        obj.greeting();
        // System.out.println("Hello Friends");//aman
        System.out.println("random task ");
        System.out.println("random task ");

        obj.greeting();
        // System.out.println("Hello Friends");//jack
        System.out.println("random task ");
        System.out.println("random task ");
        System.out.println("random task ");

        obj.greeting();
        // System.out.println("Hello Friends");//june
        System.out.println("random task");

        // Functions
        // syntax
        /*
            AccessModifier non_acc_modifier(optional) ReturnType funcName(parameters_optional){
                code block
            }
            public static void main(String[] args){

            }

         */



    }

}
