class Grade
{
public static void main(String[] args)
{
int mark = 95;
try
{
if(mark < 0 || mark > 100)
{
throw new Exception("Invalid Mark");
}
if(mark >= 90)
System.out.println("Grade A");
else if(mark >= 75)
System.out.println("Grade B");
else if(mark >= 50)
System.out.println("Grade C");
else
System.out.println("Fail");
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("Program Ended");
}
}
}