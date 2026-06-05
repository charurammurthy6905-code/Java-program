import java.util.Scanner;
class four{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T>0){
String num=sc.next();
int count=0;
for(int i=0;i<num.length();i++){
if(num.charAt(i)=='4'){
count++;
}
}
System.out.println(count);
}
sc.close();
}
}
