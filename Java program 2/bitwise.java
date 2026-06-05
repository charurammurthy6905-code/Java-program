import java.util.Scanner;
class bitwise{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int a=sc.nextInt();
System.out.println("Enter the second number:");
int b=sc.nextInt();
System.out.println("AND:"+(a&b));
System.out.println("Or:"+(a|b));
System.out.println("xor:"+(a^b));
}
}


