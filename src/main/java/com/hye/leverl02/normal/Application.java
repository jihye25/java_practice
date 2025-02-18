package com.hye.leverl02.normal;


public class Application {

    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();
        System.out.println(randomMaker.randomNumber(-100,20));
        System.out.println(RandomMaker.randomUpperAlphabet(10));
        System.out.println(RandomMaker.rockPaperScissors());
        System.out.println(RandomMaker.tossCoin());
        RandomMaker.tossCoin();
    }

}
