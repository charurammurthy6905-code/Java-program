class Banking
{
public static void main(String[] args)
{
int deposit = 500;
try
{
if(deposit < 1000)
throw new Exception("Minimum deposit is 1000");
System.out.println("Account created successfully");
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("Thank you for Banking");
}
}
}