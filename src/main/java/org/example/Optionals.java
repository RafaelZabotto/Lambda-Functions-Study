package org.example;

import java.util.Optional;

public class Optionals {

    //Options is must important for prevent NullPointExceptions
    public static void main(String[] args) {

        // Here we have two types of return, first when the optional receives a NULL the return is  "default value"
        // But, if the value is not null, the optional will return the value

        Object value = Optional.ofNullable(null).orElseGet(() -> "default value");

        System.out.println(value);

        // In this example, it you throw a exception if NULL
        Object value1 = Optional.ofNullable("hello").orElseThrow(RuntimeException::new);

        System.out.println(value1);

        //In this case, if value is not null, do something
        Optional.of(null).isPresent();
    }
}
