import java.util.Scanner;
class assigns{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
int a=sc.nextInt();
System.out.println("Enter b value:");
int b=sc.nextInt();
a+=b;
System.out.println("Add:"+a);
a-=b;
System.out.println("sub:"+a);
a*=b;
System.out.println("mul:"+a);
a/=b;
System.out.println("div:"+a);
a%=b;
System.out.println("modulus:"+a);
}
}
