import java.io.*;
public class Main {
    public static void main(String[] args) {
        File file = new File("data.txt");

        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("C:\\Users\\askar\\Documents\\Coding\\IJ_Projects\\Samsung\\Classwork\\src\\input.txt");
            output = new FileOutputStream("C:\\Users\\askar\\Documents\\Coding\\IJ_Projects\\Samsung\\Classwork\\src\\output.txt");

            int c;
            while((c = input.read()) != -1) {
                output.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}