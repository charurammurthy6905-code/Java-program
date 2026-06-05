public class stringfunction{
public static void main(String[]args){
String str=" java programming";
System.out.println("length:"+str.length());
System.out.println("character at 2:"+str.charAt(2));
System.out.println("substring:"+str.substring(1,5));
System.out.println("UpperCase:"+str.toUpperCase());
System.out.println("LowerCase:"+str.toLowerCase());
System.out.println("Trim:"+str.trim());
System.out.println("contains:"+str.contains(" java"));
System.out.println("start with ja:"+str.trim().startsWith("ja"));
System.out.println("End with ing:"+str.trim().endsWith("ing"));
System.out.println("Replace:"+str.replace("java","python"));
System.out.println("index of a:"+str.indexOf('a'));
}
}