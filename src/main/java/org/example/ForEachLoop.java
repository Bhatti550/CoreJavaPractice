package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
        List<String> names = new ArrayList<>();
        names.add("Hasan");
        names.add("Raza");
        names.add("Bhatti");
        for (String name : names) {
            System.out.println(name);
        }
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 26);
        scores.put("Bob", 25);
        scores.put("Charlie", 24);
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
