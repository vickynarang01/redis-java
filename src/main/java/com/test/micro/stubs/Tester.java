package com.test.micro.stubs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","a","abcd");

        List<String> sortedList = list.stream()
                .sorted((o1,o2)->o1.compareTo(o2))
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
