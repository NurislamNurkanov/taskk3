package com.company;

import java.util.*;

//stack primitives
//heap for sylochnyi
public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> Linkedlist = new LinkedList<>();
//        Linkedlist.add(0);
//        Linkedlist.add(1);
//        Linkedlist.add(2);
//        Linkedlist.add(3);
//        Linkedlist.add(4);
//        Linkedlist.add(5);
//        Linkedlist.add(6);
//
//        Linkedlist.remove(0);
//        Linkedlist.remove(0);
//        Linkedlist.remove(0);
//        System.out.println(Linkedlist);
//
//
//
//        Iterator<Integer> inerator = Linkedlist.iterator();
//        while (inerator.hasNext()) {
//            System.out.println(inerator.next());
//        }

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student("Nurislam",18));
        linkedList.add(new Student("Nurel",11));
        linkedList.add(new Student("Nurbol",9));
        linkedList.add(new Student("Nurkan",36));
        linkedList.add(new Student("Nurjigit",0));
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}
