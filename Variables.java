class Variables {
    public static void main(String[] args) {
       // single line comments 
       // jfhdbfjsvndsjv
       
       /*
       multiline comments
        jfhdfhdsbf
        nfjdfbd
        kbfjdf
        djbfjkdsf
        bvdfkjds
        */
        // Naming Convention
        // space b/w names are not allowed
        //  name cant start with number or any special symbol
        // underscore 
        // standards
        // for class name should be capitalized (UpperCamelCase)
        // for variable name and function name (lowerCamelCase)
        // descriptive and relevent

        // Data Types 
        // Syntax to create variable
        // dataType variableName  = value ;
        //  byte short char int long
        // Type Conversion => converting one Data type to another
        // automatic/widening/implicit
        // manual/narrowing/explicit
        //  byte < short <char <int <long <float <double 
        byte age = -128; // 8bits of space
        int myAge = age; // 32 bits of space
        float weight = 75.6f;
        String firstName = "Aman";
        age = (byte) -129;
        System.out.println(age);
        System.out.println(myAge);
        // long phoneNumber = 9899487587L;// -2^-31 to 2^31 - 1
        // String number = "9899487587";
        // double doubleNumber = 9899487587L;
        // System.out.println(phoneNumber);
        // System.out.println(number);
        // System.out.println(doubleNumber);
// I need you guys to create a variable by name contactInfo which would contain your address
        String contactInfo = "my address ";
        System.out.println(contactInfo);

        int x = 20; int y =10;
        double z = x++ - y * 7 / -- y + x * 10;
        System.out.println(x +" "+y +" "+ z);
    }   
}

// by default any integral no. is considered as int