package com.dataStructures.implementations.lists;

import com.dataStructures.interfaces.ListsADT;

public class StaticList<Generic> implements ListsADT<Generic> {

    private Generic[] listElements;
    private int listSize;

    public StaticList() {
        listElements = (Generic[]) new Object[10];
    }
    public void listAdd(Generic element) {
        if(listSize == listElements.length) {
            Generic[] auxList = (Generic[]) new Object[listSize * 2];
            for(int i = 0; i < listSize; i++) {
                auxList[i] = listElements[i];
            }
            listElements = auxList;
        }
        listElements[listSize] = element;
        listSize++;
    }
    public void listRemove(Generic element) {
        int position = listIndexOf(element);
        if(position != -1) {
            while(position < listSize - 1) {
                listElements[position] = listElements[position + 1];
                position++;
            }
            listElements[position] = null;
            listSize--;
        }
    }
    public Generic listGetElement(int position) {
        Generic result = null;
        if(position < listSize) {
            result = listElements[position];
        }
        return result;
    }
    public int listIndexOf(Generic element) {
        int result = -1, counter = 0;
        while(counter < listSize) {
            if(listElements[counter].equals(element)) {
                result = counter;
                break;
            }
            counter++;
        }
        return result;
    }
    public void listPrint() {
        System.out.println(this);
    }
    public boolean listExists(Generic element) {
        return listIndexOf(element) != -1;
    }
    public int listLength() {
        return listSize;
    }
    public void listEmpty() {
        listElements = null;
        listSize = 0;
    }
    public String toString() {
        String result = "";
        for(int i = 0; i < listSize; i++) {
            result += listElements[i] + " ";
        }
        return result;
    }
    
}
