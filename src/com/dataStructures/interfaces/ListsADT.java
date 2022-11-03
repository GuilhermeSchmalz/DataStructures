package com.dataStructures.interfaces;

public interface ListsADT<Generic> {

    public void listAdd(Generic element);
    public void listRemove(Generic element);
    public Generic listGetElement(int position);
    public int listIndexOf(Generic element);
    public void listPrint();
    public boolean listExists(Generic element);
    public int listLength();
    public void listEmpty();

}