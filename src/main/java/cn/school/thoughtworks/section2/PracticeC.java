package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        for (String element : collection1) {
            if (element.length() == 1) {
                addElementToMap(map, element, 1);
            } else {
                parseElement(map, element);
            }
        }
        return map;
    }

    private void addElementToMap(Map<String, Integer> map, String element, int extraCount) {
        Integer count = map.get(element);
        map.put(element, (count == null) ? extraCount : count + extraCount);
    }

    private void parseElement(Map<String, Integer> map, String element) {
        Pattern alphaPattern = Pattern.compile("[A-Za-z]");
        Pattern numPattern = Pattern.compile("\\d+");
        Matcher alphaMatcher = alphaPattern.matcher(element);
        Matcher numMatcher = numPattern.matcher(element);
        if (alphaMatcher.find() && numMatcher.find()) {
            addElementToMap(map, alphaMatcher.group(), Integer.parseInt(numMatcher.group()));
        }
    }
}
