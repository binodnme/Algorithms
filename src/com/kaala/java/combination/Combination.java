package com.kaala.java.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kaala on 9/1/16.
 */
public class Combination {
    public static List<String> getCombination (List<String> list) {
        if(list.size() == 1)
            return list;

        return combine(list.get(0), getCombination(list.subList(1,list.size())));
    }

    private static List<String> combine(String s, List<String> list) {
        List<String> result = new ArrayList<>();
        result.add(s);
        result.addAll(list);
        result.addAll(list.stream().map(string -> s + string).collect(Collectors.toList()));
        return result;
    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("a","b","c","d","e","f");
        List<String> result = getCombination(list);
        System.out.println(result);
    }
}
