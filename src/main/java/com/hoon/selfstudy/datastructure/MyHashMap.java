package com.hoon.selfstudy.datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();//HashMap생성
        HashMap<String, String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
        HashMap<String, String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
        HashMap<String, String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
        HashMap<String, String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
        HashMap<String, String> map6 = new HashMap<String, String>() {{//초기값 지정
            put("a", "b");
        }};


        // hashmap 추가
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");


        // putAll (HashMap 전체 넣기)
        HashMap<Integer, String> map7 = new HashMap<>() {
            {
                map.put(12, "수박");
                map.put(13, "채소");
            }
        };
        map.putAll(map7);
        System.out.println(map); // {1=사과, 2=바나나, 3=포도, 12=수박, 13=채소}

        // size() HashMap 크기 구하기
        System.out.println(map.size());

        // hashmap 삭제
        map.remove(1); //key값 1 제거
        map.clear(); // 모든 값 제거

        // 값 출력
        map.put(1, "사과");
        map.put(2, "바나나");
        map.put(3, "포도");

        System.out.println(map);
        System.out.println(map.get(2));

        // entrySet() 활용
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        // keySet() 활용
        for (Integer i : map.keySet()) {
            System.out.println(i + "    " + map.get(i));
        }

        // Iterator + entrySet 사용
        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }

        // Iterator + containsKey
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            int key = keys.next();
            System.out.println(key + "   " + map.get(key));
        }

        // containsKey
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(44));
        // containsValue
        System.out.println(map.containsValue("사과"));


        // putIfAbsent
        // Key가 존재하는 경우 있는 값 반환, Key 없는 경우 데이터 input null 반환
        System.out.println(map); // {1=사과, 2=바나나, 3=포도}
        System.out.println(map.putIfAbsent(1, "당근")); // 사과
        System.out.println(map.putIfAbsent(4, "딸기")); // null
        System.out.println(map); //{1=사과, 2=바나나, 3=포도, 4=딸기}


        // computeIfAbsent
        // key가 존재하는 경우 value반환, 없는 경우 mappingfunction 반환 및 저장
        // key, mappingFunction (key값이 존재하지 않을 때만 실행 )
        System.out.println(map.computeIfAbsent(3, key -> "디폴트값:과일")); // 포도
        System.out.println(map.computeIfAbsent(5, key -> "디폴트값:과일")); // 디폴트값:과일
        System.out.println(map);  //{1=사과, 2=바나나, 3=포도, 4=딸기, 5=디폴트값:과일}

        // compute() vs computeIfPresent() vs merge()
        // value()가 함수로 바뀐값 적용

        // compute
        map.compute(5, (k, v) -> "과일");
        System.out.println(map); // {1=사과, 2=바나나, 3=포도, 4=딸기, 5=과일}
        map.compute(10, (k, v) -> v + "과일"); // value를 null로 입력
        System.out.println(map); // {1=사과, 2=바나나, 3=포도, 4=딸기, 5=과일, 10=null과일}

        //computeIfPresent
        // 값이 있으면 업데이트 값이 없으면 업데이트 하지 않음
        System.out.println(map.computeIfPresent(3, (k, v) -> v + "포도당"));
        System.out.println(map.computeIfPresent(6, (k, v) -> v + "포도당"));

        System.out.println(map); // {1=사과, 2=바나나, 3=포도포도당, 4=딸기, 5=과일, 10=null과일}


        // merge()
        // 1. 값이 있고, 뒤에 함수값이 null이아니면 Update, 2.값이 있고, 함수결과 null이면 Key 삭제, 3. Key존재하지 않으면 Key,Value추가
        // 뒤에 함수는 Null 여부만 체크하지 Input Value에 영향을 미치지 않는다.
        map.merge(10, "과일", (k, v) -> v + "과일");
        map.merge(3, "포도", (k, v) -> null);
        map.merge(12, "체", (k, v) -> v + "리");

        System.out.println(map);  //  {1=사과, 2=바나나, 4=딸기, 5=과일, 10=과일과일, 12=체}


        // getOrDefault()
        // 값이 존재하면 Value반환 없으면 defaultValue를 반환
        System.out.println(map.getOrDefault(5, "기본값을 반환합니다"));  //과일
        System.out.println(map.getOrDefault(999, "기본값을 반환합니다")); // 기본값을 반환합니다.


    }
}
