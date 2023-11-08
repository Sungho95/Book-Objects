package com.book.objects.inheritance;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CustomSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}

class Main {
    public static void main(String[] args) {
        CustomSet<Integer> customSet = new CustomSet<>();
        customSet.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(customSet.getAddCount());
    }
}