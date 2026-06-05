import java.util.*;
class sordes
{
public static void main(String[] args)
{
ArrayList<Integer> list = new ArrayList<>();
list.add(40);
list.add(10);
list.add(30);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
}
}