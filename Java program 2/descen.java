import java.util.Arrays;
import java.util.Collections;
class descen{
public static void main(String []args)
{
Integer[]arr={5,4,3,6,7};
Arrays.sort(arr,Collections.reverseOrder());
System.out.println("Descending order:");
for(int n:arr)
{
System.out.println(n);
}
}
}

