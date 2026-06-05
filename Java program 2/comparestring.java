import java.util.Scanner;
public class comparestring{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a first string:");
String str1=sc.nextLine();
System.out.println("enter a second string:");
String str2=sc.nextLine();
if(str1.equals(str2)){
System.out.println("Strings are equal");
}
else{
System.out.println("String not equal");
}
}
}

