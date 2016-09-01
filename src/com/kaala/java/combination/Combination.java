package com.kaala.java.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author kaala on 9/1/16.
 */
public class Combination {
    public static List<String> getCombination (List<String> list) {

        if(list.size() == 2){
            return combine(list.get(0), Arrays.asList(list.get(1)));
        }

        return combine(list.get(0), getCombination(list.subList(1,list.size())));

    }

    private static List<String> combine(String s, List<String> list) {
        List<String> result = new ArrayList<>();
        result.add(s);

        for (String string: list){
            result.add(string);
            result.add(s+string);
        }
        return result;
    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("a","b","c","d","e","f");
        List<String> result = getCombination(list);
        result.sort(String::compareTo);

        System.out.println(result.size());

    }
}
