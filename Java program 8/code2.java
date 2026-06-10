import java.util.*;
public class code2 {
public static void main(String[] args) {
Queue<String> queue = new LinkedList<>();
queue.offer("Charu");
queue.offer("Priya");
queue.offer("Ramya");
while(!queue.isEmpty())
{
System.out.println(queue.poll());
}
}
}