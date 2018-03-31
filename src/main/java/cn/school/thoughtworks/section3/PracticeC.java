package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.*;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        /*Map<String, Integer> collection3 = countSameElements(collectionA);
        createUpdatedCollection(collection3, collectionB);*/
        Map<String, Integer> collection3 = PracticeA.countSameElements(collectionA);
        PracticeB.createUpdatedCollection(collection3, collectionB);
        return collection3;
    }

    /*Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> map = new HashMap<>();
        for (String element : collection1) {
            Integer count = map.get(element);
            map.put(element, (count == null) ? 1 : count + 1);
        }
        return map;
    }

    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collectionB) {
        Map<String, Integer> tempCollection = copyMap(collectionA);
        Set<String> keysInCollectionA = getIntersection(tempCollection, collectionB);
        for (String key : collectionA.keySet()) {
            if (keysInCollectionA.contains(key)) {
                subOneForEveryThree(collectionA, key);
            }
        }
        return collectionA;
    }

    private Map<String, Integer> copyMap(Map<String, Integer> collectionA) {
        Map<String, Integer> tempCollection = new HashMap<>();
        tempCollection.putAll(collectionA);
        return tempCollection;
    }

    private Set<String> getIntersection(Map<String, Integer> collectionA, Map<String, List<String>> collectionB) {
        Set<String> keysInCollectionA = collectionA.keySet();
        Set<String> valuesInCollectionB = new HashSet<>(collectionB.get("value"));
        keysInCollectionA.retainAll(valuesInCollectionB);
        return keysInCollectionA;
    }

    private void subOneForEveryThree(Map<String, Integer> collectionA, String key) {
        collectionA.put(key, (collectionA.get(key) < 3) ? collectionA.get(key) : (collectionA.get(key) - collectionA.get(key)/3));
    }*/
}
