package com.hoon.selfstudy.datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

    public static void main(String[] args) {

        // 생성자
        HashSet<Integer> set1 = new HashSet<Integer>();//HashSet생성
        HashSet<Integer> set2 = new HashSet<>();//new에서 타입 파라미터 생략가능
        HashSet<Integer> set3 = new HashSet<Integer>(set1);//set1의 모든 값을 가진 HashSet생성
        HashSet<Integer> set4 = new HashSet<Integer>(10);//초기 용량(capacity)지정
        HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f);//초기 capacity,load factor지정
        HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1, 2, 3));//초기값 지정
        HashSet<Integer> set7 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));//초기값 지정


        // 값 추가
        HashSet<Integer> set = new HashSet<Integer>();//HashSet생성
        set.add(1); //값 추가
        set.add(2);
        set.add(3);

        // 값 전체 추가
        set.addAll(set7);
        System.out.println(set);  // [1, 2, 3, 4, 5, 6]

        // 값 삭제
        set.remove(1);//값 1 제거
        set.clear();

        // 크기 구하기
        set.add(1); //값 추가
        set.add(2);
        set.add(3);
        System.out.println(set.size());

        // 값 출력하기
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 값 검색하기
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(50)); // false


    }
}
