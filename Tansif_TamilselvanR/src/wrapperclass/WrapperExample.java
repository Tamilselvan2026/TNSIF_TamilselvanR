package wrapperclass;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive int
        int num = 10;

        // Convert primitive to wrapper (Boxing)
        Integer boxedNum = Integer.valueOf(num); // Explicit
        Integer autoBoxed = num; // Auto-boxing

        // Convert wrapper to primitive (Unboxing)
        int unboxed = boxedNum.intValue(); // Explicit
        int autoUnboxed = boxedNum; // Auto-unboxing

        // Using wrapper in a collection
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num); // Auto-boxing
        numbers.add(25);
        numbers.add(42);

        // Accessing wrapper methods
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Binary of 10: " + Integer.toBinaryString(num));

        // Loop through collection
        for (Integer n : numbers) {
            System.out.println("Number: " + n);
        }
    }
}