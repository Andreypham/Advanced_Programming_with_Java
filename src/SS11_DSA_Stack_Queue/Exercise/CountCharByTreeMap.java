package SS11_DSA_Stack_Queue.Exercise;

import java.util.Map;

public class CountCharByTreeMap {
    public static void main(String[] args) {
        String str = "Codegym in Da Nang";
        String[] words = str.split("");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
        }

        java.util.TreeMap<String, Integer> map = new java.util.TreeMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                int value = map.get(words[i]);
                value++;
                map.replace(words[i], value);
            } else {
                map.put(words[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
