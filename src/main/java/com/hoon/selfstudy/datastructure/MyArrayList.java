package com.hoon.selfstudy.datastructure;

import java.util.*;

public class MyArrayList {

    public static void main(String[] args) {
        // 생성자
        ArrayList list = new ArrayList(); // 타입설정X Object로 사용
        ArrayList<MyArrayList> demo = new ArrayList<MyArrayList>();
        ArrayList<Integer> i0 = new ArrayList<Integer>(); // int타입으로 선언??? 확인 필요
        ArrayList<Integer> i2 = new ArrayList<>(); // integer 타입으로 선언
        ArrayList<Integer> i3 = new ArrayList<Integer>(10); // 초기 용량 세팅
        ArrayList<Integer> i4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)); // Arrays.asList
        ArrayList<Integer> i4Copy = new ArrayList<>(i4); // 다른 Collections 값으로 초기화

        ArrayList<String> s = new ArrayList<String>(); // String 타입 사용


        // 값 추가
        s.add("hello");
        s.add(0, "hello0"); // 인덱스 지정가능

        System.out.println(s); // [hello0, hello]


        // 값 변경
        s.set(0, "reset0");
        System.out.println(s); // [reset0, hello]

        // 값 삭제
        // clear() ArrayListd의 모든값 삭제
        // remove(index) : 해당 인덱스 값 삭제
        // remove(Object) : 해당 Object와 같은 값 삭제
        System.out.println(i4); //[1, 2, 3, 4]
        i4.remove(1);
        System.out.println(i4); // [1, 3, 4]
        Integer one = 1;
        i4.remove(one);
        System.out.println(i4); // [3, 4]

        i4.clear();
        System.out.println(i4); // []

        // 크기 구하기
        // size() : The size of the ArrayList (the number of elements it contains).
        System.out.println(s.size()); // 2
        System.out.println(i3.size()); // 0 // 초기크기값이랑 상관없이 현재 들어있는 갯수

        // ArrayList 값 출력하기
        s.clear();
        s.add("Hello");
        s.add("World");
        s.add("Hello");
        s.add("World2");

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }

        for (String str : s) {
            System.out.println(str);
        }

        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // using list iterator (역으로도 출력가능)
        ListIterator<String> listIterator = s.listIterator(s.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // ArrayList값 검색하기
        // contains(E) : 값이 있는지 여부만 파악
        // indexOf(E) : 값의 위치 Index를 찾아주고 값이 없다면 -1을 출력한다.
        System.out.println(s.contains("Hello")); // true
        System.out.println(s.contains("Hi")); // false
        System.out.println(s.indexOf("Hello")); // 0
        System.out.println(s.indexOf("World2")); // 3
        System.out.println(s.indexOf("Hi")); // -1


        // immutable한 List 객체
        List<String> results = new ArrayList<String>(List.of("a", "b", "c"));
        results = Collections.unmodifiableList(results);


    }
}
