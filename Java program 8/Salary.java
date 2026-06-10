class Salary
{
public static void main(String[] args)
{
int salary = 30,000;
int day = 1;
try
{
int perDay = salary / day;
System.out.println("Salary Per Day: " + perDay);
}
catch(ArithmeticException e)
{
System.out.println("Cannot divide by zero");
}
finally
{
System.out.println("Program Ended");
}
}
}