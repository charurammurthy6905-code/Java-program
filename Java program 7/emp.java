import java.util.HashSet;
public class emp
{
public static void main(String[] args)
{
HashSet<Integer>ids = new HashSet<>();
ids.add(101);
ids.add(102);
ids.add(103);
if(ids.contains(102))
{
System.out.println("Employee found");
}
else
{
System.out.println("Employee Not found");
}
}
}


