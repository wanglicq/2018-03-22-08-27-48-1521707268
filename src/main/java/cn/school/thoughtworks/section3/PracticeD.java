package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = PracticeB.countSameElements(collectionA);
        cn.school.thoughtworks.section3.PracticeB.createUpdatedCollection(collection3, collectionB);
        return collection3;
    }
}
