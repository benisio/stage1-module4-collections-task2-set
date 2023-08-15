package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class HashSetCreator {

    private static final Predicate<Integer> isEven = number -> number % 2 == 0;

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        var resultSet = new HashSet<Integer>();
        sourceList.forEach(number -> {
            if (isEven.test(number)) {
                resultSet.addAll(getListOfDividedByTwoNumbers(number));
            } else {
                resultSet.add(number);
                resultSet.add(2 * number);
            }
        });

        return resultSet;
    }

    private List<Integer> getListOfDividedByTwoNumbers(int number) {
        List<Integer> resultList = new ArrayList<>();

        if (isEven.test(number)) {
            resultList.add(number);
            do {
                number /= 2;
                resultList.add(number);
            } while (isEven.test(number));
        }

        return resultList;
    }

    /*public static void main(String[] args) {
        var obj = new HashSetCreator();
        System.out.println(obj.getListOfDividedByTwoNumbers(3));
        System.out.println(obj.createHashSet(List.of(2, -1, 3, 8, -5, 12)));
    }*/

}