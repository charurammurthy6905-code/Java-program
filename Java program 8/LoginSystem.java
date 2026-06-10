import java.util.Scanner;
class LoginSystem
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String username = "admin";
String password = "1234";
System.out.print("Enter Username: ");
String user = sc.nextLine();
System.out.print("Enter Password: ");
String pass = sc.nextLine();
try
{
if(user.equals(username) && pass.equals(password))
{
System.out.println("Login Successful");
}
else
{
throw new Exception("Invalid Username or Password");
}
}
catch(Exception e)
{
}
finally
{
System.out.println("Login Process Ended");
}
}
}