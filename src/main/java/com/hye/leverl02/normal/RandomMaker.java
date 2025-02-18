package com.hye.leverl02.normal;

import java.util.Random;

public class RandomMaker {

    public static int randomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;  // min과 max 사이의 정수 반환
    }

    public static String randomUpperAlphabet(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char letter = (char) ('A' + rand.nextInt(26)); // 'A'부터 'Z'까지 랜덤한 대문자 생성
            sb.append(letter);
        }
        return sb.toString();
    }

    public static String rockPaperScissors () {
        Random rand = new Random();
        String[] choices = {"가위", "바위", "보"};
        return choices[rand.nextInt(3)];
    }

        public static String tossCoin () {
            Random rand = new Random();
            return rand.nextBoolean() ? "앞면" : "뒷면";
        }
}
