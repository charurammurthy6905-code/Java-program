import java.util.Scanner;
public class countword{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a sentence");
String sentence= sc.nextLine();
String[]word=sentence.trim().split("\\s+");
System.out.println("word count:"+word.length);
}
}