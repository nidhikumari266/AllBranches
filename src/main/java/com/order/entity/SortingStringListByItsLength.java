package com.order.entity;

import java.util.Arrays;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;

public class SortingStringListByItsLength{

    public static void main(String[] args) {

        // 1. names with different length

        List<String> names = Arrays.asList(

                "Narsii",

                "Kanishkaa",

                "verna",

                "SuzukiRR",

                "Nexa",

                "creteaa",

                "scanniaRRR",

                "duA",

                "el",

                "FortunerFF"

                );


        // 1.1 print to console

        System.out.println("Original String List :- \n" + names + "\n");


        // 2. sorting String List in Ascending-order

        //TODO


        // 2.1 print ascending-order sorted Strings by its Length
        List<String> ascendingOrder = names.stream().sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println("\nAscending-order Sorted String List "

                + "by its Length :- \n" + ascendingOrder + "\n");

        //names.stream().sorted().filter(n->n.length()>10).forEach(System.out::println);

    // 3. sorting String List in Descending-order

        //TODO
        // 3.1 print descending-order sorted Strings by its Length
        List<String> descSorted = names.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
        System.out.print("\nDescending-order Sorted String List "

                + "by its Length :- \n" + descSorted);

      //names.stream().sorted().filter(n->n.length()<10).forEach(System.out::println);
    }

}
 