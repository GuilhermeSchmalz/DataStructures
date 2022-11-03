package com.dataStructures.implementations.lists;

public class DynamicTidyList<Generic extends Comparable> extends DynamicList<Generic> {

    private int compare(Generic element1, Generic element2) {
        return element1.compareTo(element2);
    }
    public void listAddTidy(Generic element) {
        ListNode<Generic> newNode = new ListNode<Generic>(element);
        if(listStart == null) {
            listStart = listEnd = newNode;
        } else {
            int comparation = compare(element, listStart.getElement());
            if(comparation < 0) {
                newNode.setNextNode(listStart);
                listStart = newNode;
            } else {
                ListNode<Generic> auxNode = listStart;
                while(auxNode.getNextNode() != null) {
                    comparation = compare(element, auxNode.getNextNode().getElement());
                    if(comparation > 0) {
                        auxNode = auxNode.getNextNode();
                    } else {
                        break;
                    }
                }
                newNode.setNextNode(auxNode.getNextNode());
                auxNode.setNextNode(newNode);
            }
        }
        listSize++;
    }
    
}
