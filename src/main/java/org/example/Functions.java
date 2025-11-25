package org.example;

import java.util.function.*;

public class Functions {

    public static void main(String[] args) {

        /*->  Most common/used types of Lambda functions
            1 - Function
            2 - BiFunction
            3 - Consumer
            4 - BiConsumer
            5 - Predicate
            6 - Supplier
        */

        record Plan (String user, String planType, String periodicity) { }

        /*
         * Functions receive a one argument and have one return, not necessary the same type
         * In functions you can use some methods, commonly .apply, .andThen, .equals.
         */
        Function<Integer, Integer> calculateAreaOfSquare = side -> side*side;

        System.out.println("--- Function ---");
        System.out.println("Area of Square = " + calculateAreaOfSquare.apply(10) + " m²\n" );


        /*
         * BiFunctions is like Functions but, they receive 2 arguments and have one return, not necessary the same type
         * The methods are the same of Functions
         */
        BiFunction<Integer, Integer, Integer> calculateAreaOfRetangle = (side1, side2) -> side1*side2;

        System.out.println("--- BiFunction ---");
        System.out.println("Area of Retangle = " + calculateAreaOfRetangle.apply(34,67) + " m²\n" );


        /*
         * Consumers receive one argument e returns no result.
         * The method is accessed .accept
         */

        Consumer<Plan> purchisingPlan = plan -> System.out.println("Congrulations you bought the " + plan.user + " plan for a " + plan.periodicity);

        System.out.println("--- Consumer ---");
        purchisingPlan.accept(new Plan("Bruno", "Silver", "month"));


        /*
         * BiConsumers are the same of Consumer but, they use two arguments
         * The methods are the same of Consumer.
         */

        BiConsumer<Plan, Boolean> checkIfIsRegistred = ((plan, aBoolean) ->
                System.out.println((aBoolean ? "Hello " + plan.user + " , you are already registred in plan " + plan.planType + " for a " + plan.periodicity :
                        "You are not registered yet, please choose a plan")));

        System.out.println("\n--- BiConsumer ---");
        Plan plan1 = new Plan("Moacir", "Gold", "week");
        checkIfIsRegistred.accept(plan1, true);


        /*
         * Predicate is a boolean function with one argument
         * To access the predicate function we need to use the .test method
         */

        Predicate<Plan> checkIfIsAPremiumUser = plan -> plan.planType().equals("Gold");

        System.out.println("\n--- Predicate ---");
        System.out.println(checkIfIsAPremiumUser.test(plan1));


        /*
         * Suplier provides some information
         * To access the suplier use .get function
         */

        Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

        System.out.println("\n--- Suplier ---");
        System.out.println(getDBConnectionUrlSupplier.get());

    }
}
