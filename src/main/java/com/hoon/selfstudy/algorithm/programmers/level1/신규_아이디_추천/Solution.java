package com.hoon.selfstudy.algorithm.programmers.level1.신규_아이디_추천;

// https://school.programmers.co.kr/learn/courses/30/lessons/72410?language=java
public class Solution {
    public String solution(String new_id) {
        String answer = "";

        String answer2 = new_id.toLowerCase();

        String[] arr = answer2.split("\\d");
//        System.out.println(arr.);


//        Pattern p = Pattern.compile("\\d");
//        Matcher matcher = p.matcher(answer2);
//        answer = matcher.group();

        return answer;
    }


    public static void main(String[] args) {

        String testString = "...!@BaT#*..y.abcdefghijklm";
        Solution solution = new Solution();
        String answer = solution.solution(testString);
        System.out.println(answer);
    }
}
