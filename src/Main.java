import domain.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person(1L, "Andy", 1);
        people[1] = new Person(2L, "Andrew", 5);
        people[2] = new Person(3L, "Matt", 15);
        people[3] = new Person(4L, "Peter", 8);
        people[4] = new Person(5L, "Carl", 4);
        /*Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        Arrays.sort(people, 1, 4);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1L, "Andy", 1));
        personList.add(new Person(2L, "Andrew", 5));
        personList.add(new Person(3L, "Matt", 15));
        personList.add(new Person(4L, "Peter", 8));
        personList.add(new Person(5L, "Carl", 4));
        Collections.sort(personList);

        System.out.println(personList);
    }
}