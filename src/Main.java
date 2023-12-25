import domain.Parcel;
import service.Example;

public class Main {
    public static void main(String[] args) {
        int sum = new Example() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }.sum(8, 13);

        System.out.println(sum);
    }
}