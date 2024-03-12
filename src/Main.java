import set.Set100Int;

public class Main {
    public static void main(String[] args) {
        Set100Int set100Int = new Set100Int();

        set100Int.add(77);
        set100Int.add(5);
        set100Int.add(-10);
        set100Int.add(100);

        System.out.println(set100Int.contains(1));
        System.out.println(set100Int.contains(5));
    }
}