package com.company;


/**
 * Created by christian.hernandez on 4/13/2017.
 */
public class LinkedList1 {

    protected Node head;
    int size;

    //creates an empty linked list
    public LinkedList1() {
        size = 0;
    }


    //adds a new node at the end of the list)(tail)
    public void add(String s) {
        if(size == 0){
            head = new Node(s);
            size++;
        }

        else {

            int nodes_to_tail = size;
            Node temp_node = head;

            while(nodes_to_tail != 1) {
                temp_node = temp_node.next;
                nodes_to_tail--;
            }
            temp_node.next = new Node(s);
            size++;
        }


    }

    //adds a new node at the specified index
    public void add(String s, int index) {

        if(size == 0){
            head = new Node(s);
            size++;
        }

        else {
            Node temp_node = head;
            while(index != 1) {
                temp_node = temp_node.next;
                index--;
            }

            Node next_node = temp_node.next;
            temp_node.next = new Node(s);
            temp_node.next.next = next_node;
            size++;
        }

    }

    public void set(String s,int index){

        if(size == 0){
            head = new Node(s);
            size++;
        }

        else {
            Node temp_node = head;
            Node previous_node = null;
            Node next_node;

            while(index!= 1) {
                if(index == 2) {
                    previous_node = temp_node;
                }
                temp_node = temp_node.next;
                index--;
            }

            next_node = temp_node.next;
            temp_node = new Node(s);
            previous_node.next = temp_node;
            temp_node.next = next_node;

        }

    }

    //deletes the node at the beginning of the list (head)
    public void delete() {

        if(size == 0) {
            throw new IndexOutOfBoundsException();
        }
        head.next = head;
        size--;

    }

    //deletes the node at the specified index
    public void delete( int index) {
        if(size == 0) {
            throw new IndexOutOfBoundsException();
        }

        else {
            Node temp_node = head;
            Node previous_node = null;
            Node next_node;

            while(index!=1) {
                if(index == 2) {
                    previous_node = temp_node;
                }

                temp_node = temp_node.next;
                index--;
            }

            next_node = temp_node.next;
            previous_node.next = next_node;



        }

    }

    public String get(int index) {
        if(size ==0) {
            throw new IndexOutOfBoundsException();
        }

        else {
            Node temp_node = head;
            while(index !=1) {
                temp_node = temp_node.next;
                index--;
            }
            return temp_node.node_data;
        }


    }


    public int size() {
        return size;
    }

    public void clear() {
        head = null;
    }
}
