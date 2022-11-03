package com.dataStructures.implementations.lists;

import com.dataStructures.interfaces.ListsADT;

public class StaticTidyList<Generic extends Comparable> implements ListsADT<Generic> {

    private Generic[] listElements;
    private int listSize;

    public StaticTidyList() {
        listElements = (Generic[]) new Comparable[10];
    }
    private int compare(Generic element1, Generic element2) {
        return element1.compareTo(element2);
    }
    public void listAdd(Generic element) {
        if(listSize == listElements.length) {
            Generic[] auxList = (Generic[]) new Comparable[listSize * 2];
            for(int i = 0; i < listSize; i++) {
                auxList[i] = listElements[i];
            }
            listElements = auxList;
        }
        int counter = listSize - 1;
        while(counter >= 0 && compare(element, listElements[counter]) < 0) {
            listElements[counter + 1] = listElements[counter];
            counter--;
        }
        listElements[counter + 1] = element;
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
        int result = -1;
        int left = 0, right = listSize - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            int comparation = compare(element, listElements[mid]);
            if(comparation == 0) {
                result = mid;
                break;
            } else if(comparation < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
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
