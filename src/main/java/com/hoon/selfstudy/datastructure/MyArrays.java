package com.hoon.selfstudy.datastructure;

import java.util.Arrays;
import java.util.List;

public class MyArrays {

    // Arrays 클래스는 항목정렬, 항목 검색, 항목 비교와 같은 메소드들을 제공한다.
    // 모든 메소드는 static(정적)메소드이므로, Arrays 클래스로 바로 사용이 가능하다.

    public static void main(String[] args) {

        // (원본 배열, 원본시작 인덱스, 타겟배열, 타겟시작 인덱스, 복사개수)
//        System.arraycopy(int[] src, int srcPos, int[]dest, int destPost, int length);

        String[] arr1 = {"h", "e", "l", "l", "o"};
        String[] arr2 = Arrays.copyOf(arr1, arr1.length); // 인덱스 어디까지 할지
        System.out.println(Arrays.toString(arr2)); // [h, e, l, l, o]
        String[] arr3 = Arrays.copyOf(arr1, arr1.length - 1); // 인덱스 어디까지 할지
        System.out.println(List.of(arr3)); // [h, e, l, l]
        String[] arr4 = Arrays.copyOfRange(arr1, 1, 3); // 인덱스범위지정
        System.out.println(List.of(arr4)); // [e, l]

        // 배열 항목 정렬
        Arrays.sort(arr1);
        System.out.println(List.of(arr1));
        // 참고) 사용자 정의 클래스라면 Comparable 인터페이슬를 구현하고 있어야 한다.

        // 배열 항목 검색
        // sort()를 한 이후에 binarySearch() 메소드로 인덱스 값을 찾을 수 있다.
        // 만약 정렬하지않거나 값이 없다면 음수를 반환
        int idx = Arrays.binarySearch(arr1, "l");
        System.out.println(idx); // 2
        int idx2 = Arrays.binarySearch(arr1, "f");
        System.out.println(idx2); // 음수값 (값은 그때그때 다르다.) // 나중에 리턴되는 음수값 원리 확인

        // 배열 동일 항목 채우기, index도 지정 가능
        String[] arr5 = new String[10];
        Arrays.fill(arr5, "sameValue");
        System.out.println(List.of(arr5));

        String[] arr6 = new String[10];
        Arrays.fill(arr6, 0, 2, "anotherValue");
        Arrays.fill(arr6, 2, 10, "sameValue");
        System.out.println(List.of(arr6));

        // Arrays.toString(arr)  1차원 배열
        // Arrays.deepToString(arr) 다차원 배열

        // Arrays.equals() 1차원 배열 비교
        // Arrays.deppEquals() 다차원 배열 비교


    }
}
