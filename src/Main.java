import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\askar\\Documents\\Coding\\IJ_Projects\\Samsung\\Classwork\\src\\data.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}