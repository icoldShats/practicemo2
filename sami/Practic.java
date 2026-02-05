package sami;

import java.util.ArrayList;
import java.util.List;

public class Practic {


    private static void changeList(List<String> list) {
        list.add("New");

    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> vege = new ArrayList<>();
        fruits.add("Apple");
        vege.add("Onion");

        changeList(fruits);
        changeList(vege);
        System.out.println(fruits);
        System.out.println(vege);
    }

}
