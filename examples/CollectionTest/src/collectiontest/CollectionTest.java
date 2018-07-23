/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author claudio
 */
public class CollectionTest {

//    static boolean filterByPeople(Airplane a) {
//        return a.getPeople() > 30;
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Simple Treeset example
        System.out.println("Simple TreeSet example");
        Set<String> set = new TreeSet<>();
        set.add("Salvatore");
        set.add("Jacopo");
        set.add("Davide");
        set.add("Giuseppe");
        set.add("Francesco");
        set.add("Francesco"); // do not add anything
        set.forEach(System.out::println);

        // Simple stream example
        set.stream()
                .filter(s -> s.charAt(0) == 'J')
                .forEach(System.out::println);

        System.out.println("");
        System.out.println("Functional interfaces tests");
        // Create Airplane set
        Set<Airplane> airplaneSet = new TreeSet<>();
        airplaneSet.add(new Airplane(3));
        airplaneSet.add(new Airplane(5));
        airplaneSet.add(new Airplane(44));

        // Create and use Predicate functional interface
        Predicate<Airplane> filterByPeople = (a -> a.getPeople() > 15);
        List<Airplane> collect = airplaneSet.stream()
                .filter(filterByPeople)
                .collect(Collectors.toList());

        // Create and use Consumer functional interface
        Consumer<Airplane> airplaneConsumer
                = (a -> System.out.println("Airplane consumer: " + a.getPeople()));
        System.out.println("");
        airplaneSet.stream().forEach(airplaneConsumer);

        // Create and use Function functional interface
        // We can also use ::new as method reference
        Function<Integer, Airplane> airplaneMaker = (Airplane::new);
        Airplane airplaneFunctionMade = airplaneMaker.apply(99);
        airplaneConsumer.accept(airplaneFunctionMade);

        // Manual invocation of each functional interface
        Airplane a1 = new Airplane(17);
        // A predicate is "tested"
        if (filterByPeople.test(a1)) {
            System.out.println("test on a1 OK!");
        }

        // A consumer "accept" an object
        airplaneConsumer.accept(a1);

        // A Function is simply applied
        airplaneMaker.apply(99);

        // HashMap example
        System.out.println("");
        System.out.println("Hash map example");
        Map<String, Airplane> map = new HashMap<>();
        map.put("Boeing 707", new Airplane(14));
        map.put("Airbus A380", new Airplane(123));
        map.forEach((key, value) -> System.out.format("Key %s; Value %s%n", key, value));

        Map<Integer, Airplane> mapIntAirplane = new HashMap<>();
        mapIntAirplane.put(12, new Airplane(22));
        mapIntAirplane.put(27, new Airplane(90));
        mapIntAirplane.forEach((key, value) -> System.out.format("Key %s; Value %s%n", key, value));

        System.out.println("");
        System.out.println("TreeMap example");
        Map<String, String> treeMap = new TreeMap<>((o1, o2) -> o1.length() - o2.length());
        treeMap.put("Marco", "Napoli");
        treeMap.put("marco", "Roma");
        treeMap.put("Giulio", "Napoli");
        treeMap.put("Giovanni", "Palermo");
        treeMap.put("Andrea", "Livorno");
        treeMap.forEach((key, value) -> System.out.format("Key %s; Value %s%n", key, value));
    }

    static class Airplane implements Comparable<Airplane> {

        private int people = 0;

        Airplane(int people) {
            this.people = people;
        }

        @Override
        public int compareTo(Airplane o) {
            return this.people - o.people;
        }

        public int getPeople() {
            return people;
        }
    }

}
