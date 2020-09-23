package com.hsbc.insurance.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(45);
        list.add("Varun");
        list.add(true);
        list.add(70.5f);

        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
