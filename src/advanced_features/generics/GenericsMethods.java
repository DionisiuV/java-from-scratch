package advanced_features.generics;

import java.util.*;

public class GenericsMethods {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        printList(stringList);
        List<Integer> integerList = new ArrayList<>();
        printList(integerList);

        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        printMap(stringIntegerHashMap);
        Map<Integer, String> integerStringMap = new HashMap<>();
        printMap(integerStringMap);
        Map<Short, Short> shortShortMap = new HashMap<>();
        printMap(shortShortMap);

        Map<List<String>, Set<Integer>> listMap = new HashMap();
        Map<Map<Byte, Short>, Map<Integer, Long>> mapMapMap = new HashMap<>();
    }

    //Razvan Question.
//    private static <T> T printList(List<T> list) {
//        return list.get(0);
//    }

    private static <T> void printList(List<T> list) {
        //
    }

    private static <K, V> void printMap(Map<K, V> list) {
        //
    }
}