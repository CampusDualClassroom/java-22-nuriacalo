package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("GKFFD");
        stringList.add("TNANA");
        stringList.add("MPMSL");
        stringList.add("PSWME");
        stringList.add("LZMLF");
        stringList.add("JYEBV");
        stringList.add("YELNT");
        stringList.add("JSNKR");
        stringList.add("JFESF");
        stringList.add("TMJLL");

        return stringList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("El elemento de la lista " + customList.get(i) + " está en el índice " + i);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        customList.add(element);
        return true;

    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        addElementToList(myList, "AAAAA");
        printElementsAndIndex(myList);
    }


}
