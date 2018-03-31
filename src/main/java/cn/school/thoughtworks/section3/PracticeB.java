package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeB {
    static Map<String,Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> tempCollection = copyMap(collectionA);
        Set<String> keysInCollectionA = getIntersection(tempCollection, collectionB);
        for (String key : collectionA.keySet()) {
            if (keysInCollectionA.contains(key)) {
                subOneForEveryThree(collectionA, key);
            }
        }
        return collectionA;
    }

    private static Map<String, Integer> copyMap(Map<String, Integer> collectionA) {
        Map<String, Integer> tempCollection = new HashMap<>();
        tempCollection.putAll(collectionA);
        return tempCollection;
    }

    private static Set<String> getIntersection(Map<String, Integer> collectionA, Map<String, List<String>> collectionB) {
        Set<String> keysInCollectionA = collectionA.keySet();
        Set<String> valuesInCollectionB = new HashSet<>(collectionB.get("value"));
        keysInCollectionA.retainAll(valuesInCollectionB);
        return keysInCollectionA;
    }

    private static void subOneForEveryThree(Map<String, Integer> collectionA, String key) {
        collectionA.put(key, (collectionA.get(key) < 3) ? collectionA.get(key) : (collectionA.get(key) - collectionA.get(key)/3));
    }
}
