import java.io.*;
public class Main {
    public static void main(String[] args) {
        File file = new File("data.txt");

        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\askar\\Documents\\Coding\\IJ_Projects\\Samsung\\Classwork\\src\\output.txt"));
            writer.println("Hello!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}