package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    public static Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> map = new HashMap<>();
        for (String element : collection1) {
            Integer count = map.get(element);
            map.put(element, (count == null) ? 1 : count + 1);
        }
        return map;
    }
}
