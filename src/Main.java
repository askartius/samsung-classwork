import domain.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        treeSet.add(new Person(1L, "Valera", 16));
        treeSet.add(new Person(1L, "Vitya", 15));

        System.out.println(treeSet);
    }
}