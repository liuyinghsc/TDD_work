package com.codeLearn;

public class staticclTest {
    private static int i = 0;

    public static void main(String[] args) {
        staticclTest staticclTest = new staticclTest();
        int i = staticclTest.i++;
        System.out.println(i);

    }
}
