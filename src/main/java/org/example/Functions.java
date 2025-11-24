package org.example;

import java.util.function.*;

public class Functions {

    /*
      ->  Most common/used types of Lambda functions
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
    static Function<Integer, Integer> calculateAreaOfSquare = side -> side*side;

    /*
     * BiFunctions is like Functions but, they receive 2 arguments and have one return, not necessary the same type
     * The methods are the same of Functions
     */
    static BiFunction<Integer, Integer, Integer> calculateAreaOfRetangle = (side1, side2) -> side1*side2;

    /*
    * Consumers receive one argument e returns no result.
    * The method is accessed .accept
    */

    static Consumer<Plan> purchisingPlan = plan -> System.out.println("Congrulations you bought the " + plan.user + " plan for a " + plan.periodicity);

    /*
    * BiConsumers are the same of Consumer but, they use two arguments
    * The methods are the same of Consumer.
    */

    static BiConsumer<Plan, Boolean> checkIfIsRegistred = ((plan, aBoolean) ->
            System.out.println((aBoolean ? "Hello " + plan.user + " , you are already registred in plan " + plan.planType + " for a " + plan.periodicity :
                    "You are not registered yet, please choose a plan")));


    /*
    * Predicate is a boolean function with one argument
    * To access the predicate function we need to use the .test method
    */

    static Predicate<Plan> checkIfIsAPremiumUser = plan -> plan.planType().equals("Gold");

    /*
    * Suplier teste 2
    */
}
