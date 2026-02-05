package comporator;

import java.util.*;

public class Main {
        public static void main(String[] args){
            List<Person> people= new ArrayList<>();
            people.add(new Person("Alice", 25));
            people.add(new Person("Bob", 20));
            people.add(new Person("Charlie", 30));

            Comparator<Person> ageComparator= new Comparator<>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.age- o2.age;
                }
            };
            Collections.sort(people,ageComparator);
            System.out.println("По возрасту: " + people);

            Collections.sort(people,((o1, o2) -> o1.name.compareTo(o2.name)));
            System.out.println("По имени: " + people);

            people.sort(((o1, o2) -> o1.name.length()- o2.name.length()));
            System.out.println("По длине имени: " + people);


        }
}
