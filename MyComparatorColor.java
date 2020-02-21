package com.education_wired_.work1;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String color_1 = ((Shape)o1).getColor();
        String color_2 = ((Shape)o2).getColor();
        return color_1.compareTo(color_2);
    }
}
