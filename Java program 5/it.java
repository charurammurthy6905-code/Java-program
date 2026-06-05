import java.util.*;
class it
{
public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("python");
Iterator<String>itr = list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}