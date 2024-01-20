import java.io.FileReader;
import java.io.FileWriter;

public class ReadFileDemo {
    public static void main(String[] args) {
        try {
            String s = "";
            FileReader r = new FileReader("FirstProgram.java");
            FileWriter f =  new FileWriter("NewFile.txt");
            int i = r.read();
            while ( i  != -1) {
                s = s + (char)i;
                System.out.print((char)i);               
                i   = r.read();
            }
            // System.out.println("s is" + s);
            f.write(s);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
