import java.util.HashSet;
public class mana
{
public static void main(String[] args){
int[] arr = {10,20,10,30,40};
HashSet<Integer>set = new HashSet<>();
for(int num :arr){
set.add(num);
}
System.out.println(set);
}
}