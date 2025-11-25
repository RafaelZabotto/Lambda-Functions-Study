package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        record Person(String name, Gender gender) {}

        List<Person> people = List.of(
                new Person("Jose", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Robson", Gender.MALE),
                new Person("Eduardo", Gender.MALE),
                new Person("Lidia", Gender.FEMALE),
                new Person("Rosa", Gender.FEMALE)
        );

        System.out.println("------------- Using functions that will manipulate our data ----------------");

        //Stream is a abstract method to work with our data with abstract functions
        people.stream()
                //.map will transform our list, converting our data in a list of genders
                .map(person -> person.gender)
                //.collect will store our data in a set list that allows only distinct values
                .collect(Collectors.toSet())
                //.foreach will print the result for each item in our set
                .forEach(System.out::println);


        System.out.println("------------- Using Predicates Functions ----------------");

        //In this case we testing if all genders in our list is FEMALE
        //Notice that .allMatch requires a predicate, because this, the return is a boolean
        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);
    }

    enum Gender {

        FEMALE,
        MALE
    }
}
