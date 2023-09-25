package com.book.objects.oop.lsp;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println("set = " + set);

        Collection<Integer> collection = set;
        collection.add(3);
        System.out.println("collection = " + collection);

        collection = new LinkedList<>();
        collection.add(4);
        System.out.println("collection = " + collection);
    }
}
