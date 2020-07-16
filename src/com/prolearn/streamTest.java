package com.prolearn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTest {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Sr");
        str.add("see");
        str.add("we");
        str.add("Se");
        List<newClass> collect = str.stream().map(streamTest::apply).collect(Collectors.toList());
        System.out.println(collect);
//        Stream<String> stringStream = str.stream().map(String::toUpperCase);
//        stringStream.forEach(System.out::println);

    }

    private static newClass apply(String s) {
        newClass nc = new newClass();
        nc.setStr(s);
        return nc;
    }
}
