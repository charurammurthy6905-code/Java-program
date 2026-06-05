public class reversestring {
public static void main(String[] args) {
String str = "Java is fun";
String reverse = "";
 for (int i = str.length(); i >= 0; i--) {
 reverse += str.charAt(i);
}
System.out.println("Original String: " + str);
System.out.println("Reversed String: " + reverse);
}
}