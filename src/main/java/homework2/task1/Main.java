package src.main.java.homework2.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    private static final Person[] personBase = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"),
            new Person(1, "Harry"),
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
            null,
            new Person(9, null)
    };

    public static void main(String[] args) {
        try {
            dublicate(personBase);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void dublicate(Person[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Список пуст!");
        }
        System.out.println("Person base: ");
        System.out.println();

        for (Person person : data) {
            if (person == null) continue;
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Отфильтрованный список людей: ");
        System.out.println();

        Arrays.stream(data)
                .filter(Objects::nonNull)
                .filter(obj -> obj.getName() != null)
                .distinct()
                .sorted(Comparator.comparing(Person::getId).thenComparing(Person::getName))
                .collect(Collectors.groupingBy(Person::getName, Collectors.counting()))
                .forEach((k, v) -> System.out.printf("Key: %s\nValue:%d\n", k, v));
    }
}
