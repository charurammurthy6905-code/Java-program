import java.util.HashSet;
public class uni{
public static void main(String[] args){
int[] arr  = {1,2,3,2,5,1};
HashSet<Integer>set = new HashSet<>();
System.out.println("duplicates Elements:");
for(int num:arr){
if (!set.add(num)){
System.out.println(num);
}
}
}
}