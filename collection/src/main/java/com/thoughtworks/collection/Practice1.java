package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Collection<Integer> collection = new ArrayList<>();
        Random random = new Random();
        while (collection.size() < 10){
            int num = random.nextInt(20);
            if (!collection.contains(num)) {
                collection.add(num);
            }
        }
        return collection;
    }
}
