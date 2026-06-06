import java.util.*;

class Visitor {
    public static void main(String[] args) {
        HashSet<String> visitors = new HashSet<>();

        visitors.add("Anu");
        visitors.add("Kavi");
        visitors.add("Anu");

        System.out.println(visitors);
    }
}