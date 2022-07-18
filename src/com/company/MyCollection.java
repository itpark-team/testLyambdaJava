package com.company;

import com.company.useless_interfaces.MyComparable;

import java.util.function.BiFunction;

public class MyCollection {
    private int[] array;

    public MyCollection() {
        array = new int[0];
    }

    public void add(int item) {
        int[] temp = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[temp.length - 1] = item;

        array = temp;
    }

    public int getItem(int index) {
        return array[index];
    }

    public int getLength() {
        return array.length;
    }

//    public void sort(MyComparable myComparable) {
//        boolean isSorted;
//        int offset = 0;
//
//        do {
//            isSorted = true;
//
//            for (int i = 0; i < array.length - 1 - offset; i++) {
//                if (myComparable.compare(array[i], array[i + 1])) {
//                    isSorted = false;
//
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
//            }
//        } while (!isSorted);
//    }

    public void sort(BiFunction<Integer, Integer, Boolean> myComparable) {
        boolean isSorted;
        int offset = 0;

        do {
            isSorted = true;

            for (int i = 0; i < array.length - 1 - offset; i++) {
                if (myComparable.apply(array[i], array[i + 1])) {
                    isSorted = false;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        } while (!isSorted);
    }
}
