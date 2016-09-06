package com.kaala.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Binod Shrestha <binodnme08@gmail.com>
 */
public class Test {
    public static List<String> getAllCombination(List<List<String>> input) {
        if(input.size() == 1){
            return input.get(0);
        }

        List<String> result  = new ArrayList<>();
        for (String s: input.get(0)){
            for (String str: getAllCombination(input.subList(1, input.size()))){
                result.add(s+str);
            }
        }

        return result;
    }

    public static void main(String[] args){
        List<List<String>> data = new ArrayList<>();
        data.add(Arrays.asList("a","A","@"));
        data.add(Arrays.asList("b","B"));

        System.out.println(getAllCombination(data));
    }
}
