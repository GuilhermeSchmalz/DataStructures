package com.dataStructures.tests;

import com.dataStructures.implementations.lists.StaticList;
import com.dataStructures.implementations.lists.StaticTidyList;
import com.dataStructures.implementations.lists.DynamicList;
import com.dataStructures.implementations.lists.DynamicTidyList;
import com.dataStructures.interfaces.ListsADT;

public class ListsTests {

    public static void main(String[] args) {
        ListsADT<Integer> newStaticIntegerList = new StaticList<Integer>(); // Test for static list of integers
        newStaticIntegerList.listAdd(7);
        newStaticIntegerList.listAdd(2);
        newStaticIntegerList.listAdd(5);
        newStaticIntegerList.listPrint();
        newStaticIntegerList.listRemove(2);
        newStaticIntegerList.listAdd(4);
        newStaticIntegerList.listPrint();
        newStaticIntegerList.listLength();
        System.out.println("Is 4 on the list? " + newStaticIntegerList.listExists(4));
        System.out.println("Is 9 on the list? " + newStaticIntegerList.listExists(9));
        newStaticIntegerList.listGetElement(3);
        newStaticIntegerList.listIndexOf(7);
        newStaticIntegerList.listEmpty();

        ListsADT<String> newStaticStringList = new StaticList<String>(); //Test for static list of Strings
        newStaticStringList.listAdd("John");
        newStaticStringList.listAdd("Mary");
        newStaticStringList.listAdd("Carl");
        newStaticStringList.listAdd("Ann");
        newStaticStringList.listPrint();
        newStaticStringList.listGetElement(2);
        newStaticStringList.listIndexOf("Mary");
        System.out.println("Is Carl on the list? " + newStaticStringList.listExists("Carl"));
        System.out.println("Is Mario on the list? " + newStaticStringList.listExists("Mario"));
        newStaticStringList.listRemove("Carl");
        newStaticStringList.listLength();
        newStaticStringList.listEmpty();

        ListsADT<Integer> newStaticTidyIntegerList = new StaticTidyList<Integer>(); // Test for static tidy list of integers
        newStaticTidyIntegerList.listAdd(7);
        newStaticTidyIntegerList.listAdd(2);
        newStaticTidyIntegerList.listAdd(5);
        newStaticTidyIntegerList.listPrint();
        newStaticTidyIntegerList.listRemove(2);
        newStaticTidyIntegerList.listAdd(4);
        newStaticTidyIntegerList.listPrint();
        newStaticTidyIntegerList.listLength();
        System.out.println("Is 4 on the list? " + newStaticTidyIntegerList.listExists(4));
        System.out.println("Is 9 on the list? " + newStaticTidyIntegerList.listExists(9));
        newStaticTidyIntegerList.listGetElement(3);
        newStaticTidyIntegerList.listIndexOf(7);
        newStaticTidyIntegerList.listEmpty();

        ListsADT<String> newStaticTidyStringList = new StaticTidyList<String>(); //Test for static tidy list of Strings
        newStaticTidyStringList.listAdd("John");
        newStaticTidyStringList.listAdd("Mary");
        newStaticTidyStringList.listAdd("Carl");
        newStaticTidyStringList.listAdd("Ann");
        newStaticTidyStringList.listPrint();
        newStaticTidyStringList.listGetElement(2);
        newStaticTidyStringList.listIndexOf("Mary");
        System.out.println("Is Carl on the list? " + newStaticTidyStringList.listExists("Carl"));
        System.out.println("Is Mario on the list? " + newStaticTidyStringList.listExists("Mario"));
        newStaticTidyStringList.listRemove("Carl");
        newStaticTidyStringList.listLength();
        newStaticTidyStringList.listEmpty();

        ListsADT<Integer> newDynamicIntegerList = new DynamicList<Integer>(); // Test for dynamic list of integers
        newDynamicIntegerList.listAdd(7);
        newDynamicIntegerList.listAdd(2);
        newDynamicIntegerList.listAdd(5);
        newDynamicIntegerList.listPrint();
        newDynamicIntegerList.listRemove(2);
        newDynamicIntegerList.listAdd(4);
        newDynamicIntegerList.listPrint();
        newDynamicIntegerList.listLength();
        System.out.println("Is 4 on the list?" + newDynamicIntegerList.listExists(4));
        System.out.println("Is 9 on the list?" + newDynamicIntegerList.listExists(9));
        newDynamicIntegerList.listGetElement(3);
        newDynamicIntegerList.listIndexOf(7);
        newDynamicIntegerList.listEmpty();

        ListsADT<String> newDynamicStringList = new DynamicList<String>(); //Test for dynamic list of Strings
        newDynamicStringList.listAdd("John");
        newDynamicStringList.listAdd("Mary");
        newDynamicStringList.listAdd("Carl");
        newDynamicStringList.listAdd("Ann");
        newDynamicStringList.listPrint();
        newDynamicStringList.listGetElement(2);
        newDynamicStringList.listIndexOf("Mary");
        System.out.println("Is Carl on the list? " + newDynamicStringList.listExists("Carl"));
        System.out.println("Is Mario on the list? " + newDynamicStringList.listExists("Mario"));
        newDynamicStringList.listRemove("Carl");
        newDynamicStringList.listLength();
        newDynamicStringList.listEmpty();

        ListsADT<Integer> newDynamicTidyIntegerList = new DynamicTidyList<Integer>(); // Test for dynamic tidy list of integers
        newDynamicTidyIntegerList.listAdd(7);
        newDynamicTidyIntegerList.listAdd(2);
        newDynamicTidyIntegerList.listAdd(5);
        newDynamicTidyIntegerList.listPrint();
        newDynamicTidyIntegerList.listRemove(2);
        newDynamicTidyIntegerList.listAdd(4);
        newDynamicTidyIntegerList.listPrint();
        newDynamicTidyIntegerList.listLength();
        System.out.println("Is 4 on the list? " + newDynamicTidyIntegerList.listExists(4));
        System.out.println("Is 9 on the list? " + newDynamicTidyIntegerList.listExists(9));
        newDynamicTidyIntegerList.listGetElement(3);
        newDynamicTidyIntegerList.listIndexOf(7);
        newDynamicTidyIntegerList.listEmpty();

        ListsADT<String> newDynamicTidyStringList = new DynamicTidyList<String>(); //Test for dynamic tidy list of Strings
        newDynamicTidyStringList.listAdd("John");
        newDynamicTidyStringList.listAdd("Mary");
        newDynamicTidyStringList.listAdd("Carl");
        newDynamicTidyStringList.listAdd("Ann");
        newDynamicTidyStringList.listPrint();
        newDynamicTidyStringList.listGetElement(2);
        newDynamicTidyStringList.listIndexOf("Mary");
        System.out.println("Is Carl on the list? " + newDynamicTidyStringList.listExists("Carl"));
        System.out.println("Is Mario on the list? " + newDynamicTidyStringList.listExists("Mario"));
        newDynamicTidyStringList.listRemove("Carl");
        newDynamicTidyStringList.listLength();
        newDynamicTidyStringList.listEmpty();
    }
    
}
