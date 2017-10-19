package com.company;

import java.util.Random;

public class LuckyNumber {

    int numOfElements = 0;

    public String[] names = new String[100];
    public int[] nums = new int[100];
    public void generate(String name){

        names[numOfElements] = name;
        perfectRandom();
    }

    private void perfectRandom(){

        Random rand = new Random();
        int num = rand.nextInt(100);
        num = num*num;

        nums[numOfElements] = num;
        numOfElements++;
    }
}
