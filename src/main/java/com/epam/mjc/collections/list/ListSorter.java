package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int a_int = Integer.parseInt(a);
        int b_int = Integer.parseInt(b);
        if (a_int * a_int > b_int * b_int)
            return 1;
        else if (a_int * a_int < b_int * b_int)
            return -1;
        else
            return Integer.compare(a_int, b_int);
    }
}
