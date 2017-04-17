package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("fourth");
        ll.add("between3and4",3);
        ll.set("newThird",3);

        for(int i = 1;i<=5;i++) {
            System.out.println(ll.get(i));
        }
    }
}
