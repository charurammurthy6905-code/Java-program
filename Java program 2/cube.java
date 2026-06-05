import java.util.Scanner;
public class cube{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
System.out.println(i*i*i+" ");
}
}
}