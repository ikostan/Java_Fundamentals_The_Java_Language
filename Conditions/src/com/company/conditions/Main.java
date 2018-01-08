package com.company.conditions;

public class Main {

    public static void main(String[] args) {

        // Conditional Logic and Relational Operators:
        int a = 1, b = 2, c = 3;

        // #1:
        if(a > b){
            System.out.println(String.format("%d > %d", a, b));
        }
        else if(a == b){
            System.out.println(String.format("%d == %d", a, b));
        }
        else{
            System.out.println(String.format("%d < %d", a, b));
        }

        // #2:
        System.out.println((a > b) ? true : false);

        // #3: and
        if(b > a && b < c){

            System.out.println(String.format("%d < %d < %d", a, b, c));
        }

        // #4: or
        if(b > a || b < c){

            System.out.println(String.format("%d < %d OR %d < %d", a, b, b, c));
        }

        // #5: Exclusive (XOR): false-true, true-false
        if(b > a ^ b > c){

            System.out.println(String.format("%d < %d ^ %d > %d", a, b, b, c));
        }

        // #6: Negation: not
        if(b != a){

            System.out.println(String.format("%d is not equal to %d", a, b));
        }
    }
}
