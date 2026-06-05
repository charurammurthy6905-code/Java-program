import java.util.Scanner;
public class operation{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter operation:");
int operation=sc.nextInt();
switch(operation)
{
case 1:
System.out.println("add:"(a+b));
break;
case 2:
System.out.println("sub:"(a-b));
break;
case 3:
System.out.println("multiply:"(a*b));
break;
case 4:
System.out.println("divission:"(a/b));
break;
case 5:
System.out.println("mod:"(a%b));
break;
default:
System.out.println("invalid month");
}
}
}
