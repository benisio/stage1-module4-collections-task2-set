package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        var resultSet = new HashSet<String>();

        // elements that belong to the first and the second Sets at once and not belong to the third Set
        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
                resultSet.add(element);
            }
        }

        // elements that belong only to the third Set
        for (String element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                resultSet.add(element);
            }
        }

        return resultSet;
    }

    /*public static void main(String[] args) {
        var obj = new SetCombinationCreator();
        var firstSet = Set.of("Java", "Collection",  "framework", "interface", "class", "Queue");
        var secondSet = Set.of("Queue", "iterator", "Java", "Collection","comparator");
        var thirdSet = Set.of("Java", "Set", "Map", "List");

        System.out.println(obj.createSetCombination(firstSet, secondSet, thirdSet));
    }*/
}
