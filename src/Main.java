import domain.Person;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person(1L, "Aleksey", 10));
        personSet.add(new Person(2L, "Petr", 11));
        personSet.add(new Person(3L, "Petr", 11));
        personSet.add(new Person(2L, "Petr", 11));

        System.out.println(personSet);
    }
}