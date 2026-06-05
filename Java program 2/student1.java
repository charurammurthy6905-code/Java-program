import java.util.Scanner;
class student1{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the mark:");
int mark=sc.nextInt();
if(mark>=40){
System.out.println("student pass");
}
else{
System.out.println("fail");
}
}
}
