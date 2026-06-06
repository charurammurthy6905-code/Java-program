import java.util.*;

class WordFreq {
    public static void main(String[] args) {
        String s = "java java python";
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : s.split(" "))
            map.put(w, map.getOrDefault(w, 0) + 1);

        System.out.println(map);
    }
}