package com.codegym;

public class Client {
    public void printList(int size, int min, int max) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(),
                                                                new ListFilter(),
                                                                new ListPrinter());
        randomListFacade.printList(size, min, max);
    }
}
