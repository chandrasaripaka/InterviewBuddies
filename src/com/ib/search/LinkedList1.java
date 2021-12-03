package com.ib.search;

public class LinkedList1 {

    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void deleteNode(Node node)
    {
        Node tmp = node.next;
        node.data = tmp.data;
        node.next = tmp.next;
        tmp = null;
    }
}
