package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Mimo", Gender.MALE),
                new Person("Gunjan", Gender.MALE),
                new Person("Shreya", Gender.FEMALE)

        );
        //imperative approach
        List<Person> female = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE) {

            }
        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
