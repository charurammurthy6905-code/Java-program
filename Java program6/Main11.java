import java.util.*;
public class Main11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(10); list.add(30); list.add(20);
        
        ArrayList<Integer> unique = new ArrayList<>();
        for(int x : list) {
            if(!unique.contains(x)) unique.add(x);
        }
        System.out.println(unique);
    }
}