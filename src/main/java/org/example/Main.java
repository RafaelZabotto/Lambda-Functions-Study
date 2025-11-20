package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Function ---");
        System.out.println("Area of Square = " + Functions.calculateAreaOfSquare.apply(10) + " m²\n" );

        System.out.println("--- BiFunction ---");
        System.out.println("Area of Retangle = " + Functions.calculateAreaOfRetangle.apply(34,67) + " m²\n" );

        System.out.println("--- Consumer ---");
        Functions.purchisingPlan.accept(new Functions.Plan("Bruno", "Silver", "month"));

        System.out.println("\n--- BiConsumer ---");
        Functions.Plan plan1 = new Functions.Plan("Moacir", "Gold", "week");
        Functions.checkIfIsRegistred.accept(plan1, true);

        System.out.println("\n--- Predicate ---");
        System.out.println(Functions.checkIfIsAPremiumUser.test(plan1));



    }
}