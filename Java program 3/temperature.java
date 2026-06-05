import java.util.Scanner;
class temperature{
public static void main(String[]args){
int [] temperature={48,34,35,32,37};
int sum=0;
int minimum=0;
int max=temperature[0];
int min=temperature[0];
for(int m: temperature)
{
sum+=m;
if(m>max){
max =m;
}
if(m<min){
min =m;
}
}
double average = (double) sum / temperature.length;
System.out.println( "higest  temperature:"+ max);
System.out.println("average:"+sum);
System.out.println("mininum temperature:"+min);
}
}
