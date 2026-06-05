import java.util.Scanner;
public class traffic{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter signal colour:");
char signal=sc.next().charAt(0);
switch(signal)
{
case 'R':
System.out.println(" Stop");
break;
case 'Y':
System.out.println("wait");
break;
case 'G':
System.out.println("go");
break;
default:
System.out.println("invalid signal");
}
}
}
