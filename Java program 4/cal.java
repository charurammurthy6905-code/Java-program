class cal
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
public static void main(String[] args){
cal c=new cal();
System.out.println("2 int:"+c.add(10,20));
System.out.println("3 int:"+c.add(10,20,30));
System.out.println("double:"+c.add(5.5,2.5));
}
}
