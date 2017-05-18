package com.kaala.java.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kaala on 9/1/16.
 */
public class Permutation {
    public static List<String> getPermutation(List<String> list) {
        if (list.size() == 1)
            return list;

        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (String s: getPermutation(remove(i, list))) {
                result.add(list.get(i) + s);
            }
        }

        return result;
    }

    private static <T> List<T> remove(int index, List<T> list){
        List<T> newList = new ArrayList<>();
        newList.addAll(list);
        newList.remove(index);
        return newList;
    }

    public static void main(String[] args){
        System.out.println(getPermutation(Arrays.asList("a","b","c","d")));
    }
}
