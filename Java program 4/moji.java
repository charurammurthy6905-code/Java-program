class Emplo
{
Emplo()
{
System.out.println("Employee details");
}
}
class manager extends Emplo
{
manager()
{
super();
System.out.println("Manager details");
}
}
class moji
{
public static void main(String[] args){
manager m =new manager();
}
}

