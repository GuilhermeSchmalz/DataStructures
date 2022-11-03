package com.dataStructures.implementations.lists;

import com.dataStructures.interfaces.ListsADT;

public class DynamicList<Generic> implements ListsADT<Generic> {

    protected ListNode<Generic> listStart, listEnd;
    protected int listSize;

    public void listAdd(Generic element) {
        ListNode<Generic> newNode 
            = new ListNode<Generic>(element);
        if(listStart == null) {
            listStart = listEnd = newNode;
        } else {
            listEnd.setNextNode(newNode);
            listEnd = newNode;
        }
        listSize++;
    }
    public void listRemove(Generic element) {
        if(listStart != null) {
            if(listStart.getElement().equals(element)) {
                listStart = listStart.getNextNode();
                if(listStart == null) {
                    listEnd = null;
                }
                listSize--;
            } else {
                ListNode<Generic> auxNode = listStart;
                while(auxNode != null) {
                    if(auxNode.getNextNode().getElement().equals(element)) {
                        auxNode.setNextNode(auxNode.getNextNode().getNextNode());
                        if(auxNode.getNextNode() == null) {
                            listEnd = auxNode;
                        }
                        listSize--;
                        break;
                    }
                    auxNode = auxNode.getNextNode();
                }
            }
        }
    }
    public Generic listGetElement(int position) {
        Generic result = null;
        int counter = 0;
        ListNode<Generic> auxNode = listStart;
        while(counter < position && auxNode != null) {
            counter++;
            auxNode = auxNode.getNextNode();       
        }
        if(auxNode != null) {
            result = auxNode.getElement();
        }
        return result;
    }
    public int listIndexOf(Generic element) {
        int result = -1, counter = 0;
        ListNode<Generic> auxNode = listStart;
        while(auxNode != null) {
            if(auxNode.getElement().equals(element)) {
                result = counter;
                break;
            }
            counter++;
            auxNode = auxNode.getNextNode();
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
        listStart = null;
        listEnd = null;
        listSize = 0;
    }
    public String toString() {
        String result = "";
        for(ListNode<Generic> auxNode = listStart; auxNode != null; auxNode = auxNode.getNextNode()) {
            result += auxNode.getElement() + " ";
        }
        return result;
    }
    
}
