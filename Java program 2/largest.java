import java.util.Scanner;
class largest{
public static void main(String[]args){
int []mark={90,80,98,90,70};
int sum=0;
int total=0;
int max=mark[0];
int failed=0;
for(int m: mark)
{
sum+=m;
if(m>max){
max =m;
}
if(m<35){
failed++;
}
}
System.out.println( "higest mark:"+ max);
System.out.println("average:"+sum);
System.out.println("no of failed:"+total);
}
}
