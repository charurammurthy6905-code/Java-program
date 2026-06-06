import java.util.*;
public class anag{
public static void main(String[] args) {
String a = "listen";
String b = "silent";
System.out.println(isAnagram(a, b));
}
static boolean isAnagram(String s1, String s2) {
s1 = s1.toLowerCase().replace(" ", "");
s2 = s2.toLowerCase().replace(" ", "");
if (s1.length() != s2.length()) return false;
HashMap<Character, Integer> m = new HashMap<>();
for (char c : s1.toCharArray()) 
m.put(c, m.getOrDefault(c, 0) + 1);
for (char c : s2.toCharArray()) 
if (m.getOrDefault(c, 0) == 0) return false;
else m.put(c, m.get(c) - 1);
return true;
}
}