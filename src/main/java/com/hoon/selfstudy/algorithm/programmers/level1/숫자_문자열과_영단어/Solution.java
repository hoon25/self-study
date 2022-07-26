package com.hoon.selfstudy.algorithm.programmers.level1.숫자_문자열과_영단어;

import java.util.HashMap;
import java.util.Map;


// https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
class Solution {

    // 최초 Solution
    public int mySolution(String s) {

        Map<String, String> TRANS_ENG_TO_NUM_MAP = new HashMap<>();
        TRANS_ENG_TO_NUM_MAP.put("zero", "0");
        TRANS_ENG_TO_NUM_MAP.put("one", "1");
        TRANS_ENG_TO_NUM_MAP.put("two", "2");
        TRANS_ENG_TO_NUM_MAP.put("three", "3");
        TRANS_ENG_TO_NUM_MAP.put("four", "4");
        TRANS_ENG_TO_NUM_MAP.put("five", "5");
        TRANS_ENG_TO_NUM_MAP.put("six", "6");
        TRANS_ENG_TO_NUM_MAP.put("seven", "7");
        TRANS_ENG_TO_NUM_MAP.put("eight", "8");
        TRANS_ENG_TO_NUM_MAP.put("nine", "9");

        StringBuilder result = new StringBuilder();

        StringBuilder tempString = new StringBuilder();
        String[] arrayS = s.split("");
        for (String oneS : arrayS) {
            if (oneS.matches("\\d")) {
                result.append(oneS);
            } else {
                tempString.append(oneS);
            }

            if (TRANS_ENG_TO_NUM_MAP.containsKey(tempString.toString())) {
                result.append(TRANS_ENG_TO_NUM_MAP.get(tempString.toString()));
                tempString = new StringBuilder();
            }
        }

        int answer = Integer.parseInt(result.toString());
        return answer;
    }

    // 변경 Solution
    public int bestSolution(String s) {
        int answer = 0;
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int len = s.length();
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphabets[i], digits[i]);
        }

        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySolution("one4seveneight"));
        System.out.println(solution.bestSolution("one4seveneight"));
    }

}


