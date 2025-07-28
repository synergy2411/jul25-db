package com.sk.advanced.generics;

public class GenericsRunner {

    public static void main(String[] args) {

        MyCustomList<String> customList = new MyCustomList<String>();
        customList.addElement("Monica");
        customList.addElement("Ross");
        customList.addElement("Rachel");
        System.out.println(customList);

        customList.removeElement(0);
        System.out.println(customList);

        MyCustomList<Integer> marks = new MyCustomList<>();
        marks.addElement(98);
        marks.addElement(94);
        marks.addElement(89);
        System.out.println(marks);

        MyCustomList<Double> theDoubleList = new MyCustomList<>();
        theDoubleList.addElement(99.5);
        theDoubleList.addElement(98.5);
        theDoubleList.addElement(83.5);
        System.out.println(theDoubleList);
    }
}
