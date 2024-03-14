import domain.Person;
import domain.Pet;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Bread", 45);
        productMap.put("Milk", 89);
        productMap.put("Cheese", 230);
        productMap.put("Dobry Cola", 70);

        System.out.println(productMap);

        productMap.put("Bread", 63);

        System.out.println(productMap);

        for (Map.Entry<String, Integer> entry: productMap.entrySet()) {
            if (entry.getKey().equals("Bread") || entry.getKey().equals("Milk")) {
                System.out.println(entry.getValue());
            }
        }
        System.out.println("----------");

        for (Integer value: productMap.values()) {
            System.out.println(value);
        }
        System.out.println("----------");

        for (String key: productMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("--------");

        System.out.println(productMap.get("Dobry Cola"));
        System.out.println("--------");

        Map<String, Integer> productTreeMap = new TreeMap<>();
        productTreeMap.put("Bread", 45);
        productTreeMap.put("Milk", 89);
        productTreeMap.put("Cheese", 230);
        productTreeMap.put("Dobry Cola", 70);

        System.out.println(productTreeMap);
        System.out.println("--------");

        Map<Person, Pet> personPetTreeMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        personPetTreeMap.put(
                new Person(1L, "Colin", 10),
                new Pet("Molly")
        );
        personPetTreeMap.put(
                new Person(2L, "Alex", 23),
                new Pet("Puk")
        );

        System.out.println(personPetTreeMap);
    }
}