package com.sk.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList <T>{

    private List<T> myList = new ArrayList<>();

    public void addElement(T item){
        myList.add(item);
    }

    public void removeElement(int i){
        myList.remove(i);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "myList=" + myList +
                '}';
    }
}
