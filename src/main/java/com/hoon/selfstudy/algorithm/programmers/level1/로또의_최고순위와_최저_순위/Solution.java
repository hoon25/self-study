package com.hoon.selfstudy.algorithm.programmers.level1.로또의_최고순위와_최저_순위;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCount = 0;
        int winCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            }
            for (int win_num : win_nums) {
                if (win_num == lotto) {
                    winCount++;
                    break;
                }
            }
        }

        int bestMatch = winCount + zeroCount;
        int worstMatch = winCount;

        int bestScore = ((7 - bestMatch) <= 5) ? (7 - bestMatch) : 6;
        int worstScore = ((7 - worstMatch) <= 5) ? (7 - worstMatch) : 6;


        int[] answer = {bestScore, worstScore};
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = solution.solution(lottos, win_nums);
        System.out.println(Arrays.toString(answer));
    }

};