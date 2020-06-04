package com.actividadII.sort;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class SortListTest {

    @org.junit.Test
    public void AgregandoNodo() {
        SortList dList = new SortList();
        dList.addNode(78);
    }

    @org.junit.Test
    public void sortList() {
        SortList dList = new SortList();
        dList.addNode(7);
        dList.addNode(1);
        dList.addNode(4);
        dList.addNode(5);
        dList.addNode(2);
        dList.sortList();

        assertEquals("Head must be 1: ", 1, dList.head);

    }

    @org.junit.Test
    public void display() {
        SortList dList = new SortList();
        SortList list = new SortList();
        dList.addNode(7);
        dList.addNode(1);
        list.addNode(7);
        list.addNode(1);

        assertSame(list.head, dList.head);

    }
}