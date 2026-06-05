import java.util.Scanner;
public class ifelse{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter mark");
int mark=sc.nextInt();
if(mark>=90){
System.out.println("Grade A");
}
else if(mark>=75){
System.out.println("Grade B");
}
else if(mark>=50){
System.out.println("grade c");
}
else
{
System.out.println("fail");
}
}
}





