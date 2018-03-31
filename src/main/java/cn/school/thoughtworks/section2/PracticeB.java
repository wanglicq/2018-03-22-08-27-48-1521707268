package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public static Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        for (String element : collection1) {
            if (element.length() == 1) {
                Integer count = map.get(element);
                map.put(element, (count == null) ? 1 : count + 1);
            } else {
                String[] str = element.split("-");
                map.put(str[0], Integer.parseInt(str[1]));
            }
        }
        return map;
    }
}
