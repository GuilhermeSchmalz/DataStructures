package com.dataStructures.implementations.lists;

public class ListNode<Generic> {

    private Generic element;
    private ListNode<Generic> nextNode;

    public ListNode(Generic element) {
        this.element = element;
    }
    public Generic getElement() {
        return element;
    }
    public void setElement(Generic element) {
        this.element = element;
    }
    public ListNode<Generic> getNextNode() {
        return nextNode;
    }
    public void setNextNode(ListNode<Generic> nextNode) {
        this.nextNode = nextNode;
    }
    public String toString() {
        return "" + element;
    }
    
}
