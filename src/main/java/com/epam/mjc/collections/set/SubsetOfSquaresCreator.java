package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        var resultSet = sourceList
                .stream()
                .map(i -> i * i)
                .collect(Collectors.toCollection(TreeSet::new));

        return resultSet.subSet(lowerBound, true, upperBound, true);
    }

    /*public static void main(String[] args) {
        var obj = new SubsetOfSquaresCreator();
        System.out.println(obj.createSubsetOfSquares(List.of(2, -1, 5, -7, 4, 6, -9, 8), 25, 49));
    }*/
}
