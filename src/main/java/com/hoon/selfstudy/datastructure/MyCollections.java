package com.hoon.selfstudy.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollections {


    public static void main(String[] args) {

        // Collections 내부 클래스는 static이기 때문에 인스턴스를 생성하지 않고 바로 사용할 수 있다.
        List<String> testList = new ArrayList<>(Arrays.asList("1번", "2번", "3번", "4번", "5번"));

        // max(), min()
        System.out.println(Collections.max(testList)); //5번
        System.out.println(Collections.min(testList)); //1번


        /*
        shuffle()
        랜덤으로 섞어줌
         */
        Collections.shuffle(testList);
        System.out.println(testList);


        /*
        sort()메서드
        Primitive는 정해진 순서대로
        Reference는 Comparable을 구현한 compareTo에 따라서 순서 적용
        오름차순 정렬
         */
        System.out.println(testList);
        Collections.sort(testList);
        System.out.println(testList);

        /*
        binarySearch()
        indexOf() 메소드와 동일
        이진 적색 알고리즘을 활용해 0-> 끝 순서로 값을 검색해서 최초 검색된 값의 인덱스를 반환
         */
        System.out.println(Collections.binarySearch(testList, "4번"));


        /*
        reverse()메서드
        지정된 목록에 있는 요소의 순서를 반대로 한다.
         */
        System.out.println(testList);
        Collections.reverse(testList);
        System.out.println(testList);

         /*
        binarySearch()
        indexOf() 메소드와 동일 X
        이진 적색 알고리즘을 활용해 0-> 끝 순서로 값을 검색해서 최초 검색된 값의 인덱스를 반환
         */
        System.out.println(Collections.binarySearch(testList, "1번")); // 정렬이 되어있지 않을 때 반환 X  //추후 DeepDive 예정
        System.out.println(testList.indexOf("1번")); //4 정상 반환

        /*
        disjoint()
        두 개의 컬렉션을 비교해서 일치하는 값이 하나도 없으면 TRUE, 하나라도 있으면 False 반환
         */
        List<String> testList2 = new ArrayList<>(Arrays.asList("1번", "2번", "999번"));
        List<String> testList3 = new ArrayList<>(Arrays.asList("1000번", "999번"));

        System.out.println(Collections.disjoint(testList, testList2));  // false
        System.out.println(Collections.disjoint(testList, testList3));  // true


        /*
        copy()
        지정된 컬렉션의 모든 요소를 새로운 컬랙션으로 복사해서 반환
        size()를 기준으로 작으면 에러
        인덱스 그대로 값이 들어간다. 원본보다큰 인덱스 부분은 그대로 값이 남음
         */

        try {
            List<String> copyListSize0 = new ArrayList<>();
            Collections.copy(copyListSize0, testList);
            System.out.println(copyListSize0);  // error
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(testList);  // [5번, 4번, 3번, 2번, 1번]
        List<String> copyListSize20 = new ArrayList<>(Arrays.asList("1번", "2번", "3번", "4번", "5번", "6번", "7번"));
        Collections.copy(copyListSize20, testList);
        System.out.println(copyListSize20);  // [5번, 4번, 3번, 2번, 1번, 6번, 7번]




        /*
        unmodifiableList()
        추가, 삭제 할 수 없는 리스트 반환
         */
        // 일급 컬렉션 속성 반환 시
        // 객체의 참조를 끊음
        List<String> immutableList = new ArrayList<String>(testList);
        // 추가삭제를 막음
        Collections.unmodifiableList(immutableList);

        /*
        emptyList()
        불변의 빈 List를 반환, 반환된 List는 직렬화 가능
         */
        List<String> emptyTestList = Collections.emptyList();
        System.out.println(emptyTestList);

        /*
        singletonList(T o)
        인자로 넘긴 객체 하나만 포함하는 불변의 List 반환
         */
        List<String> singletonList = Collections.singletonList("hello");


    }
}
