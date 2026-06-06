import java.util.*;
public class finddupl {
public static void main(String[] args) {
int[] arr = {10, 20, 10, 30, 40, 20, 50, 10};
HashSet<Integer> seen = new HashSet<>();
HashSet<Integer> duplicates = new HashSet<>();
for (int num : arr) {
if (!seen.add(num)) {        
duplicates.add(num);
}
}
System.out.println("Duplicates: " + duplicates);
}
}