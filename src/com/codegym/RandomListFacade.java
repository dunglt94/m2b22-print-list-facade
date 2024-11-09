package com.codegym;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomList randList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }

    public void printList (int size, int min, int max) {
        List<Integer> list = listFilter.filterOdd(randomList.generateList(size, min, max));
        listPrinter.printList(list);
    }
}
