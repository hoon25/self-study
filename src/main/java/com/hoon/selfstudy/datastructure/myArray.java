package com.hoon.selfstudy.datastructure;

public class MyArray {

    public static void main(String[] args) {
        // 생성자
        String[] arr1 = new String[10];
        String[] arr2 = {"String", "String2", "String3"};

        System.out.println(arr1.length); // 10
        System.out.println(arr2.length); // 2

        int arrLength = arr2.length;
        for (int i = 0; i < arrLength; i++) {
            System.out.println(arr2[i]);
        }

        for (String arrData : arr2) {
            System.out.println(arrData);
        }
    }

}
