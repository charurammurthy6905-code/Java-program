import java.util.Scanner;
public class ladder{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter username");
String user=sc.next();
System.out.println("Enter password");
int pass=sc.nextInt();
if(user.equals("bows"))
{
if(pass==1234)
{
System.out.println("login successfully");
}
else{
System.out.println("wrong password");
}
}
else{
System.out.println("Invalid password");
}
}
}

