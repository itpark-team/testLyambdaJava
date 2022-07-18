package com.company;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.add(5);
        myCollection.add(212);
        myCollection.add(4562);
        myCollection.add(15);
        myCollection.add(52);

        for (int i = 0; i < myCollection.getLength(); i++) {
            System.out.print(myCollection.getItem(i) + " ");
        }
        System.out.println();

//      MyComparable myComparable = new MyAscComparator();
//      myCollection.sort(myComparable);

//      myCollection.sort(new MyAscComparator());
//      myCollection.sort(new MyOddEvenComparator());

//        myCollection.sort(new MyComparable() {
//            @Override
//            public boolean compare(int a, int b) {
//                return a > b;
//            }
//        });

//        myCollection.sort((a, b) -> {
//            return a < b;
//        });
//
//        myCollection.sort((a, b) -> a < b);


//        myCollection.sort((item1, item2) -> item1 > item2);
//        myCollection.sort((item1, item2) -> item1 < item2);
        myCollection.sort((item1, item2) -> item1 % 2 != 0 && item2 % 2 == 0);

        for (int i = 0; i < myCollection.getLength(); i++) {
            System.out.print(myCollection.getItem(i) + " ");
        }


//        Predicate<Integer> p = item -> item > 5;
//        boolean r = p.test(1);
//
//        Consumer<Integer> c = item -> System.out.println(item);
//        c.accept(10);
//
//        Supplier<Integer> s = () -> 100;
//        System.out.println(s.get());
//
//        UnaryOperator<Integer> u = item -> item * item;
//        System.out.println(u.apply(5));
//
//        Function<Integer, String> f = item -> "value = " + Integer.toString(item);
//        System.out.println(f.apply(117));
//
//        BinaryOperator<Integer> bio = (item1, item2) -> item1 + item2;
//        System.out.println(bio.apply(23, 15));
//
//        BiFunction<Integer, Integer, Boolean> bif = (item1, item2) -> item1 > item2;
//        System.out.println(bif.apply(20, 12));
    }
}
