import java.util.Scanner;
class array{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter the number:");
arr[i]=sc.nextInt();
}
System.out.println("Array element");
for(int n:arr)
{
System.out.println(n);
}
}
}
