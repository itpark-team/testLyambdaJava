package com.company.useless_classes;

import com.company.useless_interfaces.MyComparable;

public class MyOddEvenComparator implements MyComparable {
    @Override
    public boolean compare(int a, int b) {
        return a % 2 == 0 && b % 2 != 0;
    }
}
