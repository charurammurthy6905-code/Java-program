class seven
{
public static void main(String[] args)
{
int balance = 5000;
int withdraw = 7000;
try
{
if(withdraw > balance)
{
throw new ArithmeticException("Insufficient Balance");
}
balance = balance - withdraw;
System.out.println("Remaining Balance = " + balance);
}
catch(ArithmeticException e)
{
System.out.println("Exception handled");
System.out.println(e.getMessage());
}
finally
{
System.out.println("Finally block executed");
}
}
}