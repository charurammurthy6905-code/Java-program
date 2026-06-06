import java.util.*;
public class numfre {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 10, 20};
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Number Frequency:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}