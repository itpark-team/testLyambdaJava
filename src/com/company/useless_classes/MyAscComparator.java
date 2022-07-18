package com.company.useless_classes;

import com.company.useless_interfaces.MyComparable;

public class MyAscComparator implements MyComparable {
    @Override
    public boolean compare(int a, int b) {
        return b < a;
    }
}
