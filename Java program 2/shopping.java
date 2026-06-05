import java.util.Scanner;
class shopping{
public static void main(String[]args){
int [] price={121,823,98,90,70};
int sum=0;
int total=0;
int max=price[0];
int above=0;
for(int m: price)
{
sum+=m;
if(m>max){
max =m;
}
if(m>1000){
total++;
}
}
System.out.println( "higest  price:"+ max);
System.out.println("average:"+sum);
System.out.println("Above 1000:"+total);
}
}
